package juan.springframework.spring5jokesappv2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import juan.springframework.spring5jokesappv2.services.JokeSerivce;

@Controller
public class JokeController {

  private final JokeSerivce jokeSerivce;

  public JokeController(JokeSerivce jokeSerivce) {
    this.jokeSerivce = jokeSerivce;
  }

  @RequestMapping({"/",""})
  public String showJoke(Model model){
    model.addAttribute("joke", jokeSerivce.getJoke());
    return "index";
  }

}
