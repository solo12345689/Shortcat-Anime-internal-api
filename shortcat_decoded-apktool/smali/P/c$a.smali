.class public final LP/c$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LP/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LP/c$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LP/c;Li1/t;LU0/Y0;Li1/d;LY0/u$b;)LP/c;
    .locals 7

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, LP/c;->g()Li1/t;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-ne p2, v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1}, LP/c;->f()LU0/Y0;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-interface {p4}, Li1/d;->getDensity()F

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-virtual {p1}, LP/c;->d()Li1/d;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-interface {v1}, Li1/d;->getDensity()F

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    cmpg-float v0, v0, v1

    .line 32
    .line 33
    if-nez v0, :cond_0

    .line 34
    .line 35
    invoke-virtual {p1}, LP/c;->e()LY0/u$b;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    if-ne p5, v0, :cond_0

    .line 40
    .line 41
    return-object p1

    .line 42
    :cond_0
    invoke-static {}, LP/c;->a()LP/c;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    if-eqz p1, :cond_1

    .line 47
    .line 48
    invoke-virtual {p1}, LP/c;->g()Li1/t;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    if-ne p2, v0, :cond_1

    .line 53
    .line 54
    invoke-virtual {p1}, LP/c;->f()LU0/Y0;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-eqz v0, :cond_1

    .line 63
    .line 64
    invoke-interface {p4}, Li1/d;->getDensity()F

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    invoke-virtual {p1}, LP/c;->d()Li1/d;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-interface {v1}, Li1/d;->getDensity()F

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    cmpg-float v0, v0, v1

    .line 77
    .line 78
    if-nez v0, :cond_1

    .line 79
    .line 80
    invoke-virtual {p1}, LP/c;->e()LY0/u$b;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    if-ne p5, v0, :cond_1

    .line 85
    .line 86
    return-object p1

    .line 87
    :cond_1
    new-instance v1, LP/c;

    .line 88
    .line 89
    invoke-static {p3, p2}, LU0/Z0;->d(LU0/Y0;Li1/t;)LU0/Y0;

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    const/4 v6, 0x0

    .line 94
    move-object v2, p2

    .line 95
    move-object v4, p4

    .line 96
    move-object v5, p5

    .line 97
    invoke-direct/range {v1 .. v6}, LP/c;-><init>(Li1/t;LU0/Y0;Li1/d;LY0/u$b;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 98
    .line 99
    .line 100
    invoke-static {v1}, LP/c;->b(LP/c;)V

    .line 101
    .line 102
    .line 103
    return-object v1
.end method
