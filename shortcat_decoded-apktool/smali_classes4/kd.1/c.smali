.class public final Lkd/c;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field public static final a:Lkd/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lkd/c;

    .line 2
    .line 3
    invoke-direct {v0}, Lkd/c;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lkd/c;->a:Lkd/c;

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

.method public static synthetic a()LTd/L;
    .locals 1

    .line 1
    invoke-static {}, Lkd/c;->e()LTd/L;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static synthetic b(Ljava/lang/String;)LTd/L;
    .locals 0

    .line 1
    invoke-static {p0}, Lkd/c;->f(Ljava/lang/String;)LTd/L;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final c(Ljava/lang/String;)V
    .locals 3

    .line 1
    const-string v0, "style"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lkd/c;->a:Lkd/c;

    .line 7
    .line 8
    new-instance v1, Lkd/a;

    .line 9
    .line 10
    invoke-direct {v1}, Lkd/a;-><init>()V

    .line 11
    .line 12
    .line 13
    new-instance v2, Lkd/b;

    .line 14
    .line 15
    invoke-direct {v2}, Lkd/b;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-direct {v0, p0, v1, v2}, Lkd/c;->d(Ljava/lang/String;Lie/a;Lkotlin/jvm/functions/Function1;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method private final d(Ljava/lang/String;Lie/a;Lkotlin/jvm/functions/Function1;)V
    .locals 3

    .line 1
    const/4 v0, -0x1

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    goto :goto_1

    .line 5
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_5

    .line 10
    .line 11
    const v2, 0x2eef76

    .line 12
    .line 13
    .line 14
    if-eq v1, v2, :cond_3

    .line 15
    .line 16
    const v2, 0x6233516

    .line 17
    .line 18
    .line 19
    if-eq v1, v2, :cond_2

    .line 20
    .line 21
    const v2, 0x63c2322b

    .line 22
    .line 23
    .line 24
    if-eq v1, v2, :cond_1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    const-string v1, "automatic"

    .line 28
    .line 29
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_6

    .line 34
    .line 35
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 36
    .line 37
    const/16 p3, 0x1c

    .line 38
    .line 39
    if-ge p1, p3, :cond_8

    .line 40
    .line 41
    const/4 v0, 0x3

    .line 42
    goto :goto_1

    .line 43
    :cond_2
    const-string v0, "light"

    .line 44
    .line 45
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-nez v0, :cond_7

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_3
    const-string v0, "dark"

    .line 53
    .line 54
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-nez v0, :cond_4

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_4
    const/4 v0, 0x2

    .line 62
    goto :goto_1

    .line 63
    :cond_5
    const-string v0, ""

    .line 64
    .line 65
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-nez v0, :cond_7

    .line 70
    .line 71
    :cond_6
    :goto_0
    new-instance p2, Ljava/lang/StringBuilder;

    .line 72
    .line 73
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 74
    .line 75
    .line 76
    const-string v0, "Invalid user interface style: \""

    .line 77
    .line 78
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    const-string p1, "\""

    .line 85
    .line 86
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    invoke-interface {p3, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    return-void

    .line 97
    :cond_7
    const/4 v0, 0x1

    .line 98
    :cond_8
    :goto_1
    invoke-static {v0}, Landroidx/appcompat/app/f;->L(I)V

    .line 99
    .line 100
    .line 101
    invoke-interface {p2}, Lie/a;->invoke()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    return-void
.end method

.method private static final e()LTd/L;
    .locals 1

    .line 1
    sget-object v0, LTd/L;->a:LTd/L;

    .line 2
    .line 3
    return-object v0
.end method

.method private static final f(Ljava/lang/String;)LTd/L;
    .locals 1

    .line 1
    const-string v0, "m"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "SystemUI"

    .line 7
    .line 8
    invoke-static {v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 9
    .line 10
    .line 11
    sget-object p0, LTd/L;->a:LTd/L;

    .line 12
    .line 13
    return-object p0
.end method
