.class public final LM3/e;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LS3/h$c;


# instance fields
.field private final a:LS3/h$c;

.field private final b:LM3/c;


# direct methods
.method public constructor <init>(LS3/h$c;LM3/c;)V
    .locals 1

    .line 1
    const-string v0, "delegate"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "autoCloser"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, LM3/e;->a:LS3/h$c;

    .line 15
    .line 16
    iput-object p2, p0, LM3/e;->b:LM3/c;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public bridge synthetic a(LS3/h$b;)LS3/h;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LM3/e;->b(LS3/h$b;)LM3/d;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public b(LS3/h$b;)LM3/d;
    .locals 2

    .line 1
    const-string v0, "configuration"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, LM3/d;

    .line 7
    .line 8
    iget-object v1, p0, LM3/e;->a:LS3/h$c;

    .line 9
    .line 10
    invoke-interface {v1, p1}, LS3/h$c;->a(LS3/h$b;)LS3/h;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iget-object v1, p0, LM3/e;->b:LM3/c;

    .line 15
    .line 16
    invoke-direct {v0, p1, v1}, LM3/d;-><init>(LS3/h;LM3/c;)V

    .line 17
    .line 18
    .line 19
    return-object v0
.end method
