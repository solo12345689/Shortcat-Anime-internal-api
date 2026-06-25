.class public final LK/j0;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LK/j0$a;
    }
.end annotation


# instance fields
.field private final a:I

.field private b:LK/j0$a;

.field private c:LK/j0$a;

.field private d:I

.field private e:Ljava/lang/Long;

.field private f:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, LK/j0;->a:I

    return-void
.end method

.method public synthetic constructor <init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const p1, 0x186a0

    .line 3
    :cond_0
    invoke-direct {p0, p1}, LK/j0;-><init>(I)V

    return-void
.end method

.method private final d()V
    .locals 3

    .line 1
    iget-object v0, p0, LK/j0;->b:LK/j0$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0}, LK/j0$a;->a()LK/j0$a;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-object v2, v1

    .line 12
    :goto_0
    if-nez v2, :cond_1

    .line 13
    .line 14
    goto :goto_3

    .line 15
    :cond_1
    :goto_1
    if-eqz v0, :cond_2

    .line 16
    .line 17
    invoke-virtual {v0}, LK/j0$a;->a()LK/j0$a;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    if-eqz v2, :cond_2

    .line 22
    .line 23
    invoke-virtual {v2}, LK/j0$a;->a()LK/j0$a;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    goto :goto_2

    .line 28
    :cond_2
    move-object v2, v1

    .line 29
    :goto_2
    if-eqz v2, :cond_3

    .line 30
    .line 31
    invoke-virtual {v0}, LK/j0$a;->a()LK/j0$a;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    goto :goto_1

    .line 36
    :cond_3
    if-nez v0, :cond_4

    .line 37
    .line 38
    :goto_3
    return-void

    .line 39
    :cond_4
    invoke-virtual {v0, v1}, LK/j0$a;->c(LK/j0$a;)V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public static synthetic f(LK/j0;La1/U;JILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p4, p4, 0x2

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    invoke-static {}, LK/l0;->a()J

    .line 6
    .line 7
    .line 8
    move-result-wide p2

    .line 9
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, LK/j0;->e(La1/U;J)V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, LK/j0;->f:Z

    .line 3
    .line 4
    return-void
.end method

.method public final b(La1/U;)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, LK/j0;->f:Z

    .line 3
    .line 4
    iget-object v0, p0, LK/j0;->b:LK/j0$a;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, LK/j0$a;->b()La1/U;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move-object v0, v1

    .line 15
    :goto_0
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    goto :goto_2

    .line 22
    :cond_1
    invoke-virtual {p1}, La1/U;->l()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iget-object v2, p0, LK/j0;->b:LK/j0$a;

    .line 27
    .line 28
    if-eqz v2, :cond_2

    .line 29
    .line 30
    invoke-virtual {v2}, LK/j0$a;->b()La1/U;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    invoke-virtual {v2}, La1/U;->l()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    goto :goto_1

    .line 41
    :cond_2
    move-object v2, v1

    .line 42
    :goto_1
    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-eqz v0, :cond_4

    .line 47
    .line 48
    iget-object v0, p0, LK/j0;->b:LK/j0$a;

    .line 49
    .line 50
    if-nez v0, :cond_3

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_3
    invoke-virtual {v0, p1}, LK/j0$a;->d(La1/U;)V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :cond_4
    iget-object v0, p0, LK/j0;->b:LK/j0$a;

    .line 58
    .line 59
    new-instance v2, LK/j0$a;

    .line 60
    .line 61
    invoke-direct {v2, v0, p1}, LK/j0$a;-><init>(LK/j0$a;La1/U;)V

    .line 62
    .line 63
    .line 64
    iput-object v2, p0, LK/j0;->b:LK/j0$a;

    .line 65
    .line 66
    iput-object v1, p0, LK/j0;->c:LK/j0$a;

    .line 67
    .line 68
    iget v0, p0, LK/j0;->d:I

    .line 69
    .line 70
    invoke-virtual {p1}, La1/U;->l()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    add-int/2addr v0, p1

    .line 79
    iput v0, p0, LK/j0;->d:I

    .line 80
    .line 81
    iget p1, p0, LK/j0;->a:I

    .line 82
    .line 83
    if-le v0, p1, :cond_5

    .line 84
    .line 85
    invoke-direct {p0}, LK/j0;->d()V

    .line 86
    .line 87
    .line 88
    :cond_5
    :goto_2
    return-void
.end method

.method public final c()La1/U;
    .locals 4

    .line 1
    iget-object v0, p0, LK/j0;->c:LK/j0$a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, LK/j0$a;->a()LK/j0$a;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iput-object v1, p0, LK/j0;->c:LK/j0$a;

    .line 10
    .line 11
    invoke-virtual {v0}, LK/j0$a;->b()La1/U;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    iget-object v2, p0, LK/j0;->b:LK/j0$a;

    .line 16
    .line 17
    new-instance v3, LK/j0$a;

    .line 18
    .line 19
    invoke-direct {v3, v2, v1}, LK/j0$a;-><init>(LK/j0$a;La1/U;)V

    .line 20
    .line 21
    .line 22
    iput-object v3, p0, LK/j0;->b:LK/j0$a;

    .line 23
    .line 24
    iget v1, p0, LK/j0;->d:I

    .line 25
    .line 26
    invoke-virtual {v0}, LK/j0$a;->b()La1/U;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-virtual {v2}, La1/U;->l()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    add-int/2addr v1, v2

    .line 39
    iput v1, p0, LK/j0;->d:I

    .line 40
    .line 41
    invoke-virtual {v0}, LK/j0$a;->b()La1/U;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    return-object v0

    .line 46
    :cond_0
    const/4 v0, 0x0

    .line 47
    return-object v0
.end method

.method public final e(La1/U;J)V
    .locals 4

    .line 1
    iget-boolean v0, p0, LK/j0;->f:Z

    .line 2
    .line 3
    if-nez v0, :cond_2

    .line 4
    .line 5
    iget-object v0, p0, LK/j0;->e:Ljava/lang/Long;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const-wide/16 v0, 0x0

    .line 15
    .line 16
    :goto_0
    invoke-static {}, LK/k0;->a()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    int-to-long v2, v2

    .line 21
    add-long/2addr v0, v2

    .line 22
    cmp-long v0, p2, v0

    .line 23
    .line 24
    if-lez v0, :cond_1

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_1
    return-void

    .line 28
    :cond_2
    :goto_1
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    iput-object p2, p0, LK/j0;->e:Ljava/lang/Long;

    .line 33
    .line 34
    invoke-virtual {p0, p1}, LK/j0;->b(La1/U;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public final g()La1/U;
    .locals 4

    .line 1
    iget-object v0, p0, LK/j0;->b:LK/j0$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0}, LK/j0$a;->a()LK/j0$a;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    iput-object v2, p0, LK/j0;->b:LK/j0$a;

    .line 13
    .line 14
    iget v1, p0, LK/j0;->d:I

    .line 15
    .line 16
    invoke-virtual {v0}, LK/j0$a;->b()La1/U;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    invoke-virtual {v3}, La1/U;->l()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    sub-int/2addr v1, v3

    .line 29
    iput v1, p0, LK/j0;->d:I

    .line 30
    .line 31
    invoke-virtual {v0}, LK/j0$a;->b()La1/U;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iget-object v1, p0, LK/j0;->c:LK/j0$a;

    .line 36
    .line 37
    new-instance v3, LK/j0$a;

    .line 38
    .line 39
    invoke-direct {v3, v1, v0}, LK/j0$a;-><init>(LK/j0$a;La1/U;)V

    .line 40
    .line 41
    .line 42
    iput-object v3, p0, LK/j0;->c:LK/j0$a;

    .line 43
    .line 44
    invoke-virtual {v2}, LK/j0$a;->b()La1/U;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    return-object v0

    .line 49
    :cond_0
    return-object v1
.end method
