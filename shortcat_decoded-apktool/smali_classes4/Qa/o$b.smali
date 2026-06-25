.class public final LQa/o$b;
.super LQa/d$c;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LQa/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LQa/o$b$a;
    }
.end annotation


# static fields
.field public static final d:LQa/o$b$a;


# instance fields
.field private final b:Ljava/lang/Class;

.field private final c:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LQa/o$b$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LQa/o$b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LQa/o$b;->d:LQa/o$b$a;

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
    const-class v0, LQa/o;

    .line 5
    .line 6
    iput-object v0, p0, LQa/o$b;->b:Ljava/lang/Class;

    .line 7
    .line 8
    const-string v0, "LongPressGestureHandler"

    .line 9
    .line 10
    iput-object v0, p0, LQa/o$b;->c:Ljava/lang/String;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public bridge synthetic a(Landroid/content/Context;)LQa/d;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LQa/o$b;->g(Landroid/content/Context;)LQa/o;

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
    check-cast p1, LQa/o;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LQa/o$b;->h(LQa/o;)LRa/d;

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
    iget-object v0, p0, LQa/o$b;->c:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public e()Ljava/lang/Class;
    .locals 1

    .line 1
    iget-object v0, p0, LQa/o$b;->b:Ljava/lang/Class;

    .line 2
    .line 3
    return-object v0
.end method

.method public bridge synthetic f(LQa/d;Lcom/facebook/react/bridge/ReadableMap;)V
    .locals 0

    .line 1
    check-cast p1, LQa/o;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, LQa/o$b;->i(LQa/o;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method protected g(Landroid/content/Context;)LQa/o;
    .locals 1

    .line 1
    new-instance v0, LQa/o;

    .line 2
    .line 3
    invoke-static {p1}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, p1}, LQa/o;-><init>(Landroid/content/Context;)V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method

.method public h(LQa/o;)LRa/d;
    .locals 1

    .line 1
    const-string v0, "handler"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, LRa/d;

    .line 7
    .line 8
    invoke-direct {v0, p1}, LRa/d;-><init>(LQa/o;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public i(LQa/o;Lcom/facebook/react/bridge/ReadableMap;)V
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
    const-string v0, "minDurationMs"

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
    invoke-interface {p2, v0}, Lcom/facebook/react/bridge/ReadableMap;->getInt(Ljava/lang/String;)I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    int-to-long v0, v0

    .line 27
    invoke-virtual {p1, v0, v1}, LQa/o;->a1(J)V

    .line 28
    .line 29
    .line 30
    :cond_0
    const-string v0, "maxDist"

    .line 31
    .line 32
    invoke-interface {p2, v0}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-eqz v1, :cond_1

    .line 37
    .line 38
    invoke-interface {p2, v0}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    .line 39
    .line 40
    .line 41
    move-result-wide v0

    .line 42
    invoke-static {v0, v1}, Lcom/facebook/react/uimanager/B;->h(D)F

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    invoke-static {p1, v0}, LQa/o;->V0(LQa/o;F)V

    .line 47
    .line 48
    .line 49
    :cond_1
    const-string v0, "numberOfPointers"

    .line 50
    .line 51
    invoke-interface {p2, v0}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-eqz v1, :cond_2

    .line 56
    .line 57
    invoke-interface {p2, v0}, Lcom/facebook/react/bridge/ReadableMap;->getInt(Ljava/lang/String;)I

    .line 58
    .line 59
    .line 60
    move-result p2

    .line 61
    invoke-virtual {p1, p2}, LQa/d;->D0(I)V

    .line 62
    .line 63
    .line 64
    :cond_2
    return-void
.end method
