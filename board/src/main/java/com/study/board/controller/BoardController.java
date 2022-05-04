package com.study.board.controller;

import com.study.board.entity.Board;
import com.study.board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BoardController {
    @Autowired
    private BoardService boardService;

    @GetMapping("/board/write") //localhost:8080/board/write
    public String boardWriteForm(){
        return "boardwrite";
    }

    @PostMapping("/board/writepro")
    public String boardWritePro(Board board, Model model){
        boardService.write(board);

        model.addAttribute("notice", "연등 작성이 완료되었습니다.");
        model.addAttribute("searchUrl", "/board/list");

        return "notice";
    }

    @GetMapping("/board/list")
    public String boardList(Model model){
        model.addAttribute("list",boardService.boardList());
        return "boardlist";
    }

    @GetMapping("/board/view") //localhost:8080/board/view?id=1 (id = 게시글 넘버)
    public String boardView(Model model, Integer id){
        model.addAttribute("board", boardService.boardView(id));
        return "boardview";
    }

    @GetMapping("/board/delete")
    public String boardDelete(Integer id, Model model){

       boardService.boardDelete(id);

        model.addAttribute("notice", "연등 작성이 삭제되었습니다.");
        model.addAttribute("searchUrl", "/board/list");

        return "notice";
    }

    @GetMapping("/board/modify/{id}")
    public String boardModify(@PathVariable("id") Integer id, Model model){

        model.addAttribute("board", boardService.boardView(id));
        return "boardmodify";
    }

    @PostMapping("/board/update/{id}")
    public String boardUpdate(@PathVariable("id") Integer id, Board board, Model model){

        Board boardTemp = boardService.boardView(id);
        boardTemp.setTitle(board.getTitle());
        boardTemp.setContent(board.getContent());
        boardService.write(boardTemp);

        model.addAttribute("notice", "연등 작성이 수정되었습니다.");
        model.addAttribute("searchUrl", "/board/list");

        return "notice";
        //return "redirect:/board/list";
    }
}
