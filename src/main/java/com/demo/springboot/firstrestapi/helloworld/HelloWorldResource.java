package com.demo.springboot.firstrestapi.helloworld;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldResource
{
    // hello-world-> "Hello world"

    @RequestMapping("/hello-world")
    public String helloWorld()
    {
        return "Hello WOrld";
    }

    @RequestMapping("/hello-world-bean")
    public HelloWorldBean helloWorldBean()
    {
        return new HelloWorldBean("Hello WOrld");
    }

    @RequestMapping("/hello-world-path-param/{name}")
    public HelloWorldBean helloWorldPathParam(@PathVariable String name)
    {
        return new HelloWorldBean("Hello WOrld," + name );
    }

    @RequestMapping("/hello-world-path-param/{name}/message/{message}")
    public HelloWorldBean helloWorldMultiplePathParam(@PathVariable String name, @PathVariable String message)
    {
        return new HelloWorldBean("Hello WOrld," + name + "," + message);
    }


}
