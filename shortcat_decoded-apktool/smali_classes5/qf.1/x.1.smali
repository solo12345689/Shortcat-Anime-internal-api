.class public final Lqf/x;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lqf/q0;


# static fields
.field public static final a:Lqf/x;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lqf/x;

    .line 2
    .line 3
    invoke-direct {v0}, Lqf/x;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lqf/x;->a:Lqf/x;

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
.method public a(Lze/h;Lqf/v0;Lye/m;)Lqf/r0;
    .locals 0

    .line 1
    const-string p2, "annotations"

    .line 2
    .line 3
    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Lze/h;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result p2

    .line 10
    if-eqz p2, :cond_0

    .line 11
    .line 12
    sget-object p1, Lqf/r0;->b:Lqf/r0$a;

    .line 13
    .line 14
    invoke-virtual {p1}, Lqf/r0$a;->k()Lqf/r0;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1

    .line 19
    :cond_0
    sget-object p2, Lqf/r0;->b:Lqf/r0$a;

    .line 20
    .line 21
    new-instance p3, Lqf/s;

    .line 22
    .line 23
    invoke-direct {p3, p1}, Lqf/s;-><init>(Lze/h;)V

    .line 24
    .line 25
    .line 26
    invoke-static {p3}, LUd/u;->e(Ljava/lang/Object;)Ljava/util/List;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {p2, p1}, Lqf/r0$a;->j(Ljava/util/List;)Lqf/r0;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    return-object p1
.end method
