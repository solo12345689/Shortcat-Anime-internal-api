.class final Lk9/b;
.super LP8/a$a;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, LP8/a$a;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Landroid/content/Context;Landroid/os/Looper;LR8/d;Ljava/lang/Object;LP8/f$a;LP8/f$b;)LP8/a$f;
    .locals 8

    .line 1
    check-cast p4, Lk9/a;

    .line 2
    .line 3
    new-instance v0, Ll9/a;

    .line 4
    .line 5
    const/4 v3, 0x1

    .line 6
    invoke-static {p3}, Ll9/a;->l0(LR8/d;)Landroid/os/Bundle;

    .line 7
    .line 8
    .line 9
    move-result-object v5

    .line 10
    move-object v1, p1

    .line 11
    move-object v2, p2

    .line 12
    move-object v4, p3

    .line 13
    move-object v6, p5

    .line 14
    move-object v7, p6

    .line 15
    invoke-direct/range {v0 .. v7}, Ll9/a;-><init>(Landroid/content/Context;Landroid/os/Looper;ZLR8/d;Landroid/os/Bundle;LP8/f$a;LP8/f$b;)V

    .line 16
    .line 17
    .line 18
    return-object v0
.end method
