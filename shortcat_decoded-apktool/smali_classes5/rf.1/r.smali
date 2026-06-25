.class public final Lrf/r;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field public static final a:Lrf/r;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lrf/r;

    .line 2
    .line 3
    invoke-direct {v0}, Lrf/r;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lrf/r;->a:Lrf/r;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final a(Lqf/M0;)Z
    .locals 7

    .line 1
    const-string v0, "type"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lqf/c;->a:Lqf/c;

    .line 7
    .line 8
    sget-object v1, Lrf/s;->a:Lrf/s;

    .line 9
    .line 10
    const/4 v5, 0x4

    .line 11
    const/4 v6, 0x0

    .line 12
    const/4 v2, 0x0

    .line 13
    const/4 v3, 0x1

    .line 14
    const/4 v4, 0x0

    .line 15
    invoke-static/range {v1 .. v6}, Luf/n;->a(Luf/o;ZZZILjava/lang/Object;)Lqf/u0;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-static {p1}, Lqf/L;->c(Lqf/S;)Lqf/d0;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    sget-object v2, Lqf/u0$c$b;->a:Lqf/u0$c$b;

    .line 24
    .line 25
    invoke-virtual {v0, v1, p1, v2}, Lqf/c;->a(Lqf/u0;Luf/j;Lqf/u0$c;)Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    return p1
.end method
