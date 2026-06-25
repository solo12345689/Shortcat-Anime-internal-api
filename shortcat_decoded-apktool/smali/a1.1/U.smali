.class public final La1/U;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La1/U$a;
    }
.end annotation


# static fields
.field public static final d:La1/U$a;

.field private static final e:Lh0/v;


# instance fields
.field private final a:LU0/e;

.field private final b:J

.field private final c:LU0/W0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La1/U$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, La1/U$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, La1/U;->d:La1/U$a;

    .line 8
    .line 9
    new-instance v0, La1/S;

    .line 10
    .line 11
    invoke-direct {v0}, La1/S;-><init>()V

    .line 12
    .line 13
    .line 14
    new-instance v1, La1/T;

    .line 15
    .line 16
    invoke-direct {v1}, La1/T;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-static {v0, v1}, Lh0/y;->e(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)Lh0/v;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sput-object v0, La1/U;->e:Lh0/v;

    .line 24
    .line 25
    return-void
.end method

.method private constructor <init>(LU0/e;JLU0/W0;)V
    .locals 1

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, La1/U;->a:LU0/e;

    .line 5
    invoke-virtual {p0}, La1/U;->l()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    const/4 v0, 0x0

    invoke-static {p2, p3, v0, p1}, LU0/X0;->c(JII)J

    move-result-wide p1

    iput-wide p1, p0, La1/U;->b:J

    if-eqz p4, :cond_0

    .line 6
    invoke-virtual {p4}, LU0/W0;->r()J

    move-result-wide p1

    invoke-virtual {p0}, La1/U;->l()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result p3

    invoke-static {p1, p2, v0, p3}, LU0/X0;->c(JII)J

    move-result-wide p1

    invoke-static {p1, p2}, LU0/W0;->b(J)LU0/W0;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, La1/U;->c:LU0/W0;

    return-void
.end method

.method public synthetic constructor <init>(LU0/e;JLU0/W0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    .line 7
    sget-object p2, LU0/W0;->b:LU0/W0$a;

    invoke-virtual {p2}, LU0/W0$a;->a()J

    move-result-wide p2

    :cond_0
    move-wide v2, p2

    and-int/lit8 p2, p5, 0x4

    if-eqz p2, :cond_1

    const/4 p4, 0x0

    :cond_1
    move-object v4, p4

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    .line 8
    invoke-direct/range {v0 .. v5}, La1/U;-><init>(LU0/e;JLU0/W0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(LU0/e;JLU0/W0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, La1/U;-><init>(LU0/e;JLU0/W0;)V

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;JLU0/W0;)V
    .locals 6

    .line 12
    new-instance v1, LU0/e;

    const/4 v0, 0x0

    const/4 v2, 0x2

    invoke-direct {v1, p1, v0, v2, v0}, LU0/e;-><init>(Ljava/lang/String;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v5, 0x0

    move-object v0, p0

    move-wide v2, p2

    move-object v4, p4

    invoke-direct/range {v0 .. v5}, La1/U;-><init>(LU0/e;JLU0/W0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;JLU0/W0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    .line 9
    const-string p1, ""

    :cond_0
    move-object v1, p1

    and-int/lit8 p1, p5, 0x2

    if-eqz p1, :cond_1

    .line 10
    sget-object p1, LU0/W0;->b:LU0/W0$a;

    invoke-virtual {p1}, LU0/W0$a;->a()J

    move-result-wide p2

    :cond_1
    move-wide v2, p2

    and-int/lit8 p1, p5, 0x4

    if-eqz p1, :cond_2

    const/4 p4, 0x0

    :cond_2
    move-object v4, p4

    const/4 v5, 0x0

    move-object v0, p0

    .line 11
    invoke-direct/range {v0 .. v5}, La1/U;-><init>(Ljava/lang/String;JLU0/W0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;JLU0/W0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2, p3, p4}, La1/U;-><init>(Ljava/lang/String;JLU0/W0;)V

    return-void
.end method

.method public static synthetic a(Lh0/z;La1/U;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0, p1}, La1/U;->c(Lh0/z;La1/U;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic b(Ljava/lang/Object;)La1/U;
    .locals 0

    .line 1
    invoke-static {p0}, La1/U;->d(Ljava/lang/Object;)La1/U;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final c(Lh0/z;La1/U;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p1, La1/U;->a:LU0/e;

    .line 2
    .line 3
    invoke-static {}, LU0/A0;->L0()Lh0/v;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-static {v0, v1, p0}, LU0/A0;->a1(Ljava/lang/Object;Lh0/v;Lh0/z;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-wide v1, p1, La1/U;->b:J

    .line 12
    .line 13
    invoke-static {v1, v2}, LU0/W0;->b(J)LU0/W0;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    sget-object v1, LU0/W0;->b:LU0/W0$a;

    .line 18
    .line 19
    invoke-static {v1}, LU0/A0;->M0(LU0/W0$a;)Lh0/v;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-static {p1, v1, p0}, LU0/A0;->a1(Ljava/lang/Object;Lh0/v;Lh0/z;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    filled-new-array {v0, p0}, [Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-static {p0}, LUd/u;->g([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0
.end method

.method private static final d(Ljava/lang/Object;)La1/U;
    .locals 7

    .line 1
    const-string v0, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    check-cast p0, Ljava/util/List;

    .line 7
    .line 8
    new-instance v0, La1/U;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-static {}, LU0/A0;->L0()Lh0/v;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 20
    .line 21
    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    const/4 v5, 0x0

    .line 26
    if-eqz v4, :cond_1

    .line 27
    .line 28
    instance-of v4, v2, LU0/u;

    .line 29
    .line 30
    if-nez v4, :cond_1

    .line 31
    .line 32
    :cond_0
    move-object v1, v5

    .line 33
    goto :goto_0

    .line 34
    :cond_1
    if-eqz v1, :cond_0

    .line 35
    .line 36
    invoke-interface {v2, v1}, Lh0/v;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    check-cast v1, LU0/e;

    .line 41
    .line 42
    :goto_0
    invoke-static {v1}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    const/4 v2, 0x1

    .line 46
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    sget-object v2, LU0/W0;->b:LU0/W0$a;

    .line 51
    .line 52
    invoke-static {v2}, LU0/A0;->M0(LU0/W0$a;)Lh0/v;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-static {p0, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    if-eqz v3, :cond_2

    .line 61
    .line 62
    instance-of v3, v2, LU0/u;

    .line 63
    .line 64
    if-nez v3, :cond_2

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_2
    if-eqz p0, :cond_3

    .line 68
    .line 69
    invoke-interface {v2, p0}, Lh0/v;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    move-object v5, p0

    .line 74
    check-cast v5, LU0/W0;

    .line 75
    .line 76
    :cond_3
    :goto_1
    invoke-static {v5}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v5}, LU0/W0;->r()J

    .line 80
    .line 81
    .line 82
    move-result-wide v2

    .line 83
    const/4 v5, 0x4

    .line 84
    const/4 v6, 0x0

    .line 85
    const/4 v4, 0x0

    .line 86
    invoke-direct/range {v0 .. v6}, La1/U;-><init>(LU0/e;JLU0/W0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 87
    .line 88
    .line 89
    return-object v0
.end method

.method public static synthetic g(La1/U;LU0/e;JLU0/W0;ILjava/lang/Object;)La1/U;
    .locals 0

    .line 1
    and-int/lit8 p6, p5, 0x1

    .line 2
    .line 3
    if-eqz p6, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, La1/U;->a:LU0/e;

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p6, p5, 0x2

    .line 8
    .line 9
    if-eqz p6, :cond_1

    .line 10
    .line 11
    iget-wide p2, p0, La1/U;->b:J

    .line 12
    .line 13
    :cond_1
    and-int/lit8 p5, p5, 0x4

    .line 14
    .line 15
    if-eqz p5, :cond_2

    .line 16
    .line 17
    iget-object p4, p0, La1/U;->c:LU0/W0;

    .line 18
    .line 19
    :cond_2
    invoke-virtual {p0, p1, p2, p3, p4}, La1/U;->e(LU0/e;JLU0/W0;)La1/U;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
.end method

.method public static synthetic h(La1/U;Ljava/lang/String;JLU0/W0;ILjava/lang/Object;)La1/U;
    .locals 0

    .line 1
    and-int/lit8 p6, p5, 0x2

    .line 2
    .line 3
    if-eqz p6, :cond_0

    .line 4
    .line 5
    iget-wide p2, p0, La1/U;->b:J

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p5, p5, 0x4

    .line 8
    .line 9
    if-eqz p5, :cond_1

    .line 10
    .line 11
    iget-object p4, p0, La1/U;->c:LU0/W0;

    .line 12
    .line 13
    :cond_1
    invoke-virtual {p0, p1, p2, p3, p4}, La1/U;->f(Ljava/lang/String;JLU0/W0;)La1/U;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method


# virtual methods
.method public final e(LU0/e;JLU0/W0;)La1/U;
    .locals 6

    .line 1
    new-instance v0, La1/U;

    .line 2
    .line 3
    const/4 v5, 0x0

    .line 4
    move-object v1, p1

    .line 5
    move-wide v2, p2

    .line 6
    move-object v4, p4

    .line 7
    invoke-direct/range {v0 .. v5}, La1/U;-><init>(LU0/e;JLU0/W0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, La1/U;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    iget-wide v3, p0, La1/U;->b:J

    .line 12
    .line 13
    check-cast p1, La1/U;

    .line 14
    .line 15
    iget-wide v5, p1, La1/U;->b:J

    .line 16
    .line 17
    invoke-static {v3, v4, v5, v6}, LU0/W0;->g(JJ)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_2

    .line 22
    .line 23
    iget-object v1, p0, La1/U;->c:LU0/W0;

    .line 24
    .line 25
    iget-object v3, p1, La1/U;->c:LU0/W0;

    .line 26
    .line 27
    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    iget-object v1, p0, La1/U;->a:LU0/e;

    .line 34
    .line 35
    iget-object p1, p1, La1/U;->a:LU0/e;

    .line 36
    .line 37
    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    if-eqz p1, :cond_2

    .line 42
    .line 43
    return v0

    .line 44
    :cond_2
    return v2
.end method

.method public final f(Ljava/lang/String;JLU0/W0;)La1/U;
    .locals 6

    .line 1
    new-instance v0, La1/U;

    .line 2
    .line 3
    new-instance v1, LU0/e;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x2

    .line 7
    invoke-direct {v1, p1, v2, v3, v2}, LU0/e;-><init>(Ljava/lang/String;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 8
    .line 9
    .line 10
    const/4 v5, 0x0

    .line 11
    move-wide v2, p2

    .line 12
    move-object v4, p4

    .line 13
    invoke-direct/range {v0 .. v5}, La1/U;-><init>(LU0/e;JLU0/W0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, La1/U;->a:LU0/e;

    .line 2
    .line 3
    invoke-virtual {v0}, LU0/e;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-wide v1, p0, La1/U;->b:J

    .line 10
    .line 11
    invoke-static {v1, v2}, LU0/W0;->o(J)I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/2addr v0, v1

    .line 16
    mul-int/lit8 v0, v0, 0x1f

    .line 17
    .line 18
    iget-object v1, p0, La1/U;->c:LU0/W0;

    .line 19
    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    invoke-virtual {v1}, LU0/W0;->r()J

    .line 23
    .line 24
    .line 25
    move-result-wide v1

    .line 26
    invoke-static {v1, v2}, LU0/W0;->o(J)I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const/4 v1, 0x0

    .line 32
    :goto_0
    add-int/2addr v0, v1

    .line 33
    return v0
.end method

.method public final i()LU0/e;
    .locals 1

    .line 1
    iget-object v0, p0, La1/U;->a:LU0/e;

    .line 2
    .line 3
    return-object v0
.end method

.method public final j()LU0/W0;
    .locals 1

    .line 1
    iget-object v0, p0, La1/U;->c:LU0/W0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final k()J
    .locals 2

    .line 1
    iget-wide v0, p0, La1/U;->b:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final l()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, La1/U;->a:LU0/e;

    .line 2
    .line 3
    invoke-virtual {v0}, LU0/e;->j()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "TextFieldValue(text=\'"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, La1/U;->a:LU0/e;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string v1, "\', selection="

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    iget-wide v1, p0, La1/U;->b:J

    .line 22
    .line 23
    invoke-static {v1, v2}, LU0/W0;->q(J)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v1, ", composition="

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    iget-object v1, p0, La1/U;->c:LU0/W0;

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const/16 v1, 0x29

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    return-object v0
.end method
