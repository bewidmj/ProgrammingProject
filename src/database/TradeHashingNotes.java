
package database;

class Trade {
    String tradeId;

    public Trade(String tradeId ) {
        this.tradeId = tradeId;
    }

    public int hashCode() {
        return 1000;
    }

    // public boolean equals() {
    //     return true;
    // }


}

// Map<TradeObject, String> map
//t1 "123"
//t2, "789"
// map.put(t1, "Buy");
//sout(map.get(t2));

// t3 , ""
//map.put(t2, "BUY");
//map.put(t3, "SELL");

//map.get(t2);


table - employeeid, name

1,a
2,b
3,a
4,c
5,b
6,t
7,a
8,e
9,d


select name from employee where name IN (
    select name, count(id) as cnt from employee group by name cnt >= 3
)






