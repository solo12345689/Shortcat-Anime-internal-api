.class public abstract Lmf/Q;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field public static final a:LXe/c;

.field public static final b:LXe/a;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, LXe/c;

    .line 2
    .line 3
    const-string v1, "kotlin.suspend"

    .line 4
    .line 5
    invoke-direct {v0, v1}, LXe/c;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lmf/Q;->a:LXe/c;

    .line 9
    .line 10
    new-instance v0, LXe/a;

    .line 11
    .line 12
    sget-object v1, Lve/o;->A:LXe/c;

    .line 13
    .line 14
    const-string v2, "suspend"

    .line 15
    .line 16
    invoke-static {v2}, LXe/f;->m(Ljava/lang/String;)LXe/f;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    const-string v3, "identifier(...)"

    .line 21
    .line 22
    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-direct {v0, v1, v2}, LXe/a;-><init>(LXe/c;LXe/f;)V

    .line 26
    .line 27
    .line 28
    sput-object v0, Lmf/Q;->b:LXe/a;

    .line 29
    .line 30
    return-void
.end method
