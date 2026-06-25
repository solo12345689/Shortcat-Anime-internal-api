.class final LK0/e0$d;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LK0/e0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LK0/e0$d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LK0/e0$d;

    .line 2
    .line 3
    invoke-direct {v0}, LK0/e0$d;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LK0/e0$d;->a:LK0/e0$d;

    .line 7
    .line 8
    return-void
.end method

.method constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 3
    .line 4
    .line 5
    return-void
.end method


# virtual methods
.method public final a(LK0/e0;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, LK0/e0;->J0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_3

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    const/4 v1, 0x1

    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-static {p1, v0, v1, v2}, LK0/e0;->I3(LK0/e0;ZILjava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    if-eqz v3, :cond_3

    .line 15
    .line 16
    invoke-virtual {p1}, LK0/e0;->L1()LK0/J;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p1}, LK0/J;->d0()LK0/O;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-virtual {v3}, LK0/O;->c()I

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    if-lez v4, :cond_2

    .line 29
    .line 30
    invoke-virtual {v3}, LK0/O;->e()Z

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    if-nez v4, :cond_0

    .line 35
    .line 36
    invoke-virtual {v3}, LK0/O;->f()Z

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    if-eqz v4, :cond_1

    .line 41
    .line 42
    :cond_0
    invoke-static {p1, v0, v1, v2}, LK0/J;->G1(LK0/J;ZILjava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    :cond_1
    invoke-virtual {v3}, LK0/O;->v()LK0/X;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-virtual {v0}, LK0/X;->d2()V

    .line 50
    .line 51
    .line 52
    :cond_2
    invoke-virtual {p1}, LK0/J;->S0()V

    .line 53
    .line 54
    .line 55
    invoke-static {p1}, LK0/N;->b(LK0/J;)LK0/p0;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-interface {v0}, LK0/p0;->getRectManager()LS0/b;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-virtual {v1, p1}, LS0/b;->j(LK0/J;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1}, LK0/J;->U()I

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    if-lez v1, :cond_3

    .line 71
    .line 72
    invoke-interface {v0, p1}, LK0/p0;->D(LK0/J;)V

    .line 73
    .line 74
    .line 75
    :cond_3
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LK0/e0;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LK0/e0$d;->a(LK0/e0;)V

    .line 4
    .line 5
    .line 6
    sget-object p1, LTd/L;->a:LTd/L;

    .line 7
    .line 8
    return-object p1
.end method
