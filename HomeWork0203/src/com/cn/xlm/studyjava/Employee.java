package com.cn.xlm.studyjava;

/**
 * @author shkstart
 * @create 2021-02-04-5:41 PM
 */
class Employee extends Person {

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Employee(String name, int id) {
        super(name);
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }

        if(obj == null || getClass() != obj.getClass()){
            return false;
        }

        Employee employee = (Employee) obj;
        if(employee.getName() == null | getName() == null) {
            return false;
        }else {
            return getName().equalsIgnoreCase(employee.getName()) && employee.getId() == id;
        }

    }
}
