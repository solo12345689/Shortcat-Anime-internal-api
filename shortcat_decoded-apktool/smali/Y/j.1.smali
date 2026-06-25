.class final LY/j;
.super Ljava/lang/Exception;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:Lt/V;

.field private final b:Lt/V;

.field private final c:Lt/m;

.field private final d:I


# direct methods
.method public constructor <init>(Lt/V;Lt/V;Lt/m;ILjava/lang/Throwable;)V
    .locals 0

    .line 1
    invoke-direct {p0, p5}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LY/j;->a:Lt/V;

    .line 5
    .line 6
    iput-object p2, p0, LY/j;->b:Lt/V;

    .line 7
    .line 8
    iput-object p3, p0, LY/j;->c:Lt/m;

    .line 9
    .line 10
    iput p4, p0, LY/j;->d:I

    .line 11
    .line 12
    return-void
.end method

.method public static final synthetic a(LY/j;)Lt/V;
    .locals 0

    .line 1
    iget-object p0, p0, LY/j;->a:Lt/V;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic b(LY/j;)I
    .locals 0

    .line 1
    iget p0, p0, LY/j;->d:I

    .line 2
    .line 3
    return p0
.end method

.method public static final synthetic c(LY/j;)Lt/m;
    .locals 0

    .line 1
    iget-object p0, p0, LY/j;->c:Lt/m;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic d(LY/j;)Lt/V;
    .locals 0

    .line 1
    iget-object p0, p0, LY/j;->b:Lt/V;

    .line 2
    .line 3
    return-object p0
.end method

.method private final e()LCf/i;
    .locals 2

    .line 1
    new-instance v0, LY/j$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, LY/j$a;-><init>(LY/j;LZd/e;)V

    .line 5
    .line 6
    .line 7
    invoke-static {v0}, LCf/l;->b(Lkotlin/jvm/functions/Function2;)LCf/i;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method


# virtual methods
.method public getMessage()Ljava/lang/String;
    .locals 12

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "\n            |Exception while applying pausable composition. Last 10 operations:\n            |"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, LY/j;->e()LCf/i;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-static {v1}, LCf/l;->T(LCf/i;)Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const/16 v2, 0xa

    .line 20
    .line 21
    invoke-static {v1, v2}, LUd/u;->U0(Ljava/util/List;I)Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    const/16 v10, 0x3e

    .line 26
    .line 27
    const/4 v11, 0x0

    .line 28
    const-string v4, "\n"

    .line 29
    .line 30
    const/4 v5, 0x0

    .line 31
    const/4 v6, 0x0

    .line 32
    const/4 v7, 0x0

    .line 33
    const/4 v8, 0x0

    .line 34
    const/4 v9, 0x0

    .line 35
    invoke-static/range {v3 .. v11}, LUd/u;->w0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string v1, "\n            "

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    const/4 v1, 0x0

    .line 52
    const/4 v2, 0x1

    .line 53
    invoke-static {v0, v1, v2, v1}, LDf/r;->l(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    return-object v0
.end method
