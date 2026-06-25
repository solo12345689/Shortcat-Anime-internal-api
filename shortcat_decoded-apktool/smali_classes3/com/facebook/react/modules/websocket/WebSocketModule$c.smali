.class public final Lcom/facebook/react/modules/websocket/WebSocketModule$c;
.super Ldg/J;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/modules/websocket/WebSocketModule;->connect(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/ReadableMap;D)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/react/modules/websocket/WebSocketModule;

.field final synthetic b:I


# direct methods
.method constructor <init>(Lcom/facebook/react/modules/websocket/WebSocketModule;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/modules/websocket/WebSocketModule$c;->a:Lcom/facebook/react/modules/websocket/WebSocketModule;

    .line 2
    .line 3
    iput p2, p0, Lcom/facebook/react/modules/websocket/WebSocketModule$c;->b:I

    .line 4
    .line 5
    invoke-direct {p0}, Ldg/J;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(Ldg/I;ILjava/lang/String;)V
    .locals 4

    .line 1
    const-string v0, "webSocket"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "reason"

    .line 7
    .line 8
    invoke-static {p3, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget v0, p0, Lcom/facebook/react/modules/websocket/WebSocketModule$c;->b:I

    .line 12
    .line 13
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    new-instance v2, Lcom/facebook/react/bridge/ReadableMapBuilder;

    .line 18
    .line 19
    invoke-direct {v2, v1}, Lcom/facebook/react/bridge/ReadableMapBuilder;-><init>(Lcom/facebook/react/bridge/WritableMap;)V

    .line 20
    .line 21
    .line 22
    const-string v3, "id"

    .line 23
    .line 24
    invoke-virtual {v2, v3, v0}, Lcom/facebook/react/bridge/ReadableMapBuilder;->put(Ljava/lang/String;I)V

    .line 25
    .line 26
    .line 27
    const-string v0, "code"

    .line 28
    .line 29
    invoke-virtual {v2, v0, p2}, Lcom/facebook/react/bridge/ReadableMapBuilder;->put(Ljava/lang/String;I)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v2, p1, p3}, Lcom/facebook/react/bridge/ReadableMapBuilder;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    iget-object p1, p0, Lcom/facebook/react/modules/websocket/WebSocketModule$c;->a:Lcom/facebook/react/modules/websocket/WebSocketModule;

    .line 36
    .line 37
    const-string p2, "websocketClosed"

    .line 38
    .line 39
    invoke-static {p1, p2, v1}, Lcom/facebook/react/modules/websocket/WebSocketModule;->access$sendEvent(Lcom/facebook/react/modules/websocket/WebSocketModule;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public b(Ldg/I;ILjava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "websocket"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "reason"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p1, p2, p3}, Ldg/I;->e(ILjava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public c(Ldg/I;Ljava/lang/Throwable;Ldg/E;)V
    .locals 0

    .line 1
    const-string p3, "webSocket"

    .line 2
    .line 3
    invoke-static {p1, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "t"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/facebook/react/modules/websocket/WebSocketModule$c;->a:Lcom/facebook/react/modules/websocket/WebSocketModule;

    .line 12
    .line 13
    iget p3, p0, Lcom/facebook/react/modules/websocket/WebSocketModule$c;->b:I

    .line 14
    .line 15
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    invoke-static {p1, p3, p2}, Lcom/facebook/react/modules/websocket/WebSocketModule;->access$notifyWebSocketFailed(Lcom/facebook/react/modules/websocket/WebSocketModule;ILjava/lang/String;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public d(Ldg/I;Ljava/lang/String;)V
    .locals 3

    .line 1
    const-string v0, "webSocket"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "text"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, "id"

    .line 16
    .line 17
    iget v2, p0, Lcom/facebook/react/modules/websocket/WebSocketModule$c;->b:I

    .line 18
    .line 19
    invoke-interface {v0, v1, v2}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    const-string v1, "type"

    .line 23
    .line 24
    invoke-interface {v0, v1, p1}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lcom/facebook/react/modules/websocket/WebSocketModule$c;->a:Lcom/facebook/react/modules/websocket/WebSocketModule;

    .line 28
    .line 29
    invoke-static {p1}, Lcom/facebook/react/modules/websocket/WebSocketModule;->access$getContentHandlers$p(Lcom/facebook/react/modules/websocket/WebSocketModule;)Ljava/util/Map;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iget v1, p0, Lcom/facebook/react/modules/websocket/WebSocketModule$c;->b:I

    .line 34
    .line 35
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    check-cast p1, Lcom/facebook/react/modules/websocket/WebSocketModule$b;

    .line 44
    .line 45
    if-eqz p1, :cond_0

    .line 46
    .line 47
    invoke-interface {p1, p2, v0}, Lcom/facebook/react/modules/websocket/WebSocketModule$b;->a(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    const-string p1, "data"

    .line 52
    .line 53
    invoke-interface {v0, p1, p2}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    :goto_0
    iget-object p1, p0, Lcom/facebook/react/modules/websocket/WebSocketModule$c;->a:Lcom/facebook/react/modules/websocket/WebSocketModule;

    .line 57
    .line 58
    const-string p2, "websocketMessage"

    .line 59
    .line 60
    invoke-static {p1, p2, v0}, Lcom/facebook/react/modules/websocket/WebSocketModule;->access$sendEvent(Lcom/facebook/react/modules/websocket/WebSocketModule;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 61
    .line 62
    .line 63
    return-void
.end method

.method public e(Ldg/I;Ltg/k;)V
    .locals 2

    .line 1
    const-string v0, "webSocket"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "bytes"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    const-string v0, "id"

    .line 16
    .line 17
    iget v1, p0, Lcom/facebook/react/modules/websocket/WebSocketModule$c;->b:I

    .line 18
    .line 19
    invoke-interface {p1, v0, v1}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    const-string v0, "type"

    .line 23
    .line 24
    const-string v1, "binary"

    .line 25
    .line 26
    invoke-interface {p1, v0, v1}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Lcom/facebook/react/modules/websocket/WebSocketModule$c;->a:Lcom/facebook/react/modules/websocket/WebSocketModule;

    .line 30
    .line 31
    invoke-static {v0}, Lcom/facebook/react/modules/websocket/WebSocketModule;->access$getContentHandlers$p(Lcom/facebook/react/modules/websocket/WebSocketModule;)Ljava/util/Map;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iget v1, p0, Lcom/facebook/react/modules/websocket/WebSocketModule$c;->b:I

    .line 36
    .line 37
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    check-cast v0, Lcom/facebook/react/modules/websocket/WebSocketModule$b;

    .line 46
    .line 47
    if-eqz v0, :cond_0

    .line 48
    .line 49
    invoke-interface {v0, p2, p1}, Lcom/facebook/react/modules/websocket/WebSocketModule$b;->b(Ltg/k;Lcom/facebook/react/bridge/WritableMap;)V

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    invoke-virtual {p2}, Ltg/k;->b()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    const-string v0, "data"

    .line 58
    .line 59
    invoke-interface {p1, v0, p2}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    :goto_0
    iget-object p2, p0, Lcom/facebook/react/modules/websocket/WebSocketModule$c;->a:Lcom/facebook/react/modules/websocket/WebSocketModule;

    .line 63
    .line 64
    const-string v0, "websocketMessage"

    .line 65
    .line 66
    invoke-static {p2, v0, p1}, Lcom/facebook/react/modules/websocket/WebSocketModule;->access$sendEvent(Lcom/facebook/react/modules/websocket/WebSocketModule;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 67
    .line 68
    .line 69
    return-void
.end method

.method public f(Ldg/I;Ldg/E;)V
    .locals 3

    .line 1
    const-string v0, "webSocket"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "response"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/facebook/react/modules/websocket/WebSocketModule$c;->a:Lcom/facebook/react/modules/websocket/WebSocketModule;

    .line 12
    .line 13
    invoke-static {v0}, Lcom/facebook/react/modules/websocket/WebSocketModule;->access$getWebSocketConnections$p(Lcom/facebook/react/modules/websocket/WebSocketModule;)Ljava/util/Map;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget v1, p0, Lcom/facebook/react/modules/websocket/WebSocketModule$c;->b:I

    .line 18
    .line 19
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    iget p1, p0, Lcom/facebook/react/modules/websocket/WebSocketModule$c;->b:I

    .line 27
    .line 28
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    new-instance v1, Lcom/facebook/react/bridge/ReadableMapBuilder;

    .line 33
    .line 34
    invoke-direct {v1, v0}, Lcom/facebook/react/bridge/ReadableMapBuilder;-><init>(Lcom/facebook/react/bridge/WritableMap;)V

    .line 35
    .line 36
    .line 37
    const-string v2, "id"

    .line 38
    .line 39
    invoke-virtual {v1, v2, p1}, Lcom/facebook/react/bridge/ReadableMapBuilder;->put(Ljava/lang/String;I)V

    .line 40
    .line 41
    .line 42
    const-string p1, "Sec-WebSocket-Protocol"

    .line 43
    .line 44
    const-string v2, ""

    .line 45
    .line 46
    invoke-virtual {p2, p1, v2}, Ldg/E;->C(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    const-string p2, "protocol"

    .line 51
    .line 52
    invoke-virtual {v1, p2, p1}, Lcom/facebook/react/bridge/ReadableMapBuilder;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    iget-object p1, p0, Lcom/facebook/react/modules/websocket/WebSocketModule$c;->a:Lcom/facebook/react/modules/websocket/WebSocketModule;

    .line 56
    .line 57
    const-string p2, "websocketOpen"

    .line 58
    .line 59
    invoke-static {p1, p2, v0}, Lcom/facebook/react/modules/websocket/WebSocketModule;->access$sendEvent(Lcom/facebook/react/modules/websocket/WebSocketModule;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 60
    .line 61
    .line 62
    return-void
.end method
