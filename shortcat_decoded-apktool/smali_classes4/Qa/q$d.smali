.class public final LQa/q$d;
.super LQa/d$c;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LQa/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LQa/q$d$a;
    }
.end annotation


# static fields
.field public static final d:LQa/q$d$a;


# instance fields
.field private final b:Ljava/lang/Class;

.field private final c:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LQa/q$d$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LQa/q$d$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LQa/q$d;->d:LQa/q$d$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, LQa/d$c;-><init>()V

    .line 2
    .line 3
    .line 4
    const-class v0, LQa/q;

    .line 5
    .line 6
    iput-object v0, p0, LQa/q$d;->b:Ljava/lang/Class;

    .line 7
    .line 8
    const-string v0, "NativeViewGestureHandler"

    .line 9
    .line 10
    iput-object v0, p0, LQa/q$d;->c:Ljava/lang/String;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public bridge synthetic a(Landroid/content/Context;)LQa/d;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LQa/q$d;->g(Landroid/content/Context;)LQa/q;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic c(LQa/d;)LRa/b;
    .locals 0

    .line 1
    check-cast p1, LQa/q;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LQa/q$d;->h(LQa/q;)LRa/f;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LQa/q$d;->c:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public e()Ljava/lang/Class;
    .locals 1

    .line 1
    iget-object v0, p0, LQa/q$d;->b:Ljava/lang/Class;

    .line 2
    .line 3
    return-object v0
.end method

.method public bridge synthetic f(LQa/d;Lcom/facebook/react/bridge/ReadableMap;)V
    .locals 0

    .line 1
    check-cast p1, LQa/q;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, LQa/q$d;->i(LQa/q;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method protected g(Landroid/content/Context;)LQa/q;
    .locals 0

    .line 1
    new-instance p1, LQa/q;

    .line 2
    .line 3
    invoke-direct {p1}, LQa/q;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object p1
.end method

.method public h(LQa/q;)LRa/f;
    .locals 1

    .line 1
    const-string v0, "handler"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, LRa/f;

    .line 7
    .line 8
    invoke-direct {v0, p1}, LRa/f;-><init>(LQa/q;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public i(LQa/q;Lcom/facebook/react/bridge/ReadableMap;)V
    .locals 2

    .line 1
    const-string v0, "handler"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "config"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-super {p0, p1, p2}, LQa/d$c;->f(LQa/d;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 12
    .line 13
    .line 14
    const-string v0, "shouldActivateOnStart"

    .line 15
    .line 16
    invoke-interface {p2, v0}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    invoke-interface {p2, v0}, Lcom/facebook/react/bridge/ReadableMap;->getBoolean(Ljava/lang/String;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    invoke-static {p1, v0}, LQa/q;->V0(LQa/q;Z)V

    .line 27
    .line 28
    .line 29
    :cond_0
    const-string v0, "disallowInterruption"

    .line 30
    .line 31
    invoke-interface {p2, v0}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    invoke-interface {p2, v0}, Lcom/facebook/react/bridge/ReadableMap;->getBoolean(Ljava/lang/String;)Z

    .line 38
    .line 39
    .line 40
    move-result p2

    .line 41
    invoke-static {p1, p2}, LQa/q;->U0(LQa/q;Z)V

    .line 42
    .line 43
    .line 44
    :cond_1
    return-void
.end method
