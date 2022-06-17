# SubjectA - 3

``` 
あなたはめるが逃げたAfnwCore2の完成を任されました。

難しい機能は さんいろこ と しゃけ が作ってくれるそうなので、あなたは以下の機能を作りましょう。

※ AfnwCore2は Paper 1.18.2 で動作します。作る際は合わせます。

・ログインメッセージを「〇〇がサーバーに参加しました」にする
・プレイヤーが睡眠したらそのことをサーバー全体に通知する機能
・プレイヤーのゲームモードが変わったらそのことをサーバー全体に通知する機能
・プレイヤーが村人や行商人と交易したらそのことをサーバー全体に通知する機能
```

> **Warning**
> 
> Paperのプラグインは基本的に "setJoinMessage()" などのSpigotではおなじみのメソッドが非推奨になり、Paper専用のメソッドが用意されています。
> 模範解答中の "JoinMessage()" などは "setJoinMessage()" と同義です。
```java
public class PlayerJoin implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        // joinMessage() は setJoinMessage() ではないのでこれはエラーになる
        e.joinMessage("がサーバーに参加しました");
    }
    
}
```

```java
public class PlayerJoin implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        // 本来stringをいれるところにComponent.text()を使う
        e.joinMessage(Component.text(e.getPlayer().getName() + "がサーバーに参加しました"));
    }
    
}
```
