.class public abstract Lxe/v;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field private static final a:LXe/f;

.field private static final b:LXe/f;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "getFirst"

    .line 2
    .line 3
    invoke-static {v0}, LXe/f;->m(Ljava/lang/String;)LXe/f;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "identifier(...)"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    sput-object v0, Lxe/v;->a:LXe/f;

    .line 13
    .line 14
    const-string v0, "getLast"

    .line 15
    .line 16
    invoke-static {v0}, LXe/f;->m(Ljava/lang/String;)LXe/f;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lxe/v;->b:LXe/f;

    .line 24
    .line 25
    return-void
.end method

.method public static final synthetic a()LXe/f;
    .locals 1

    .line 1
    sget-object v0, Lxe/v;->a:LXe/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic b()LXe/f;
    .locals 1

    .line 1
    sget-object v0, Lxe/v;->b:LXe/f;

    .line 2
    .line 3
    return-object v0
.end method
