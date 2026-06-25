.class public abstract Lbf/v;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field private static final a:Lye/G;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lye/G;

    .line 2
    .line 3
    const-string v1, "StdlibClassFinder"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lye/G;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lbf/v;->a:Lye/G;

    .line 9
    .line 10
    return-void
.end method

.method public static final a(Lye/H;)Lbf/u;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lbf/v;->a:Lye/G;

    .line 7
    .line 8
    invoke-interface {p0, v0}, Lye/H;->a0(Lye/G;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Lbf/u;

    .line 13
    .line 14
    if-nez p0, :cond_0

    .line 15
    .line 16
    sget-object p0, Lbf/b;->a:Lbf/b;

    .line 17
    .line 18
    :cond_0
    return-object p0
.end method
