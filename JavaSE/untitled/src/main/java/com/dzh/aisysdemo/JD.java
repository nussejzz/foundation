package com.dzh.aisysdemo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class JD implements Switch {
    private String name;
    private boolean state;
    @Override
    public void press() {
        state = !state;
        System.out.println("JD state: " + name + (state ? "开" : "关"));
    }

}
