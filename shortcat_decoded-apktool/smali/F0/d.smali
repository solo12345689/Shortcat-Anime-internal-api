.class public final LF0/d;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:LF0/c$a;

.field private final b:LF0/c;

.field private final c:LF0/c;

.field private d:J

.field private e:J


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>()V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, LF0/e;->i()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    sget-object v0, LF0/c$a;->b:LF0/c$a;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    sget-object v0, LF0/c$a;->a:LF0/c$a;

    .line 14
    .line 15
    :goto_0
    iput-object v0, p0, LF0/d;->a:LF0/c$a;

    .line 16
    .line 17
    new-instance v1, LF0/c;

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    const/4 v3, 0x1

    .line 21
    const/4 v4, 0x0

    .line 22
    invoke-direct {v1, v2, v0, v3, v4}, LF0/c;-><init>(ZLF0/c$a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 23
    .line 24
    .line 25
    iput-object v1, p0, LF0/d;->b:LF0/c;

    .line 26
    .line 27
    new-instance v1, LF0/c;

    .line 28
    .line 29
    invoke-direct {v1, v2, v0, v3, v4}, LF0/c;-><init>(ZLF0/c$a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 30
    .line 31
    .line 32
    iput-object v1, p0, LF0/d;->c:LF0/c;

    .line 33
    .line 34
    sget-object v0, Lr0/f;->b:Lr0/f$a;

    .line 35
    .line 36
    invoke-virtual {v0}, Lr0/f$a;->c()J

    .line 37
    .line 38
    .line 39
    move-result-wide v0

    .line 40
    iput-wide v0, p0, LF0/d;->d:J

    .line 41
    .line 42
    return-void
.end method


# virtual methods
.method public final a(JJ)V
    .locals 3

    .line 1
    iget-object v0, p0, LF0/d;->b:LF0/c;

    .line 2
    .line 3
    const/16 v1, 0x20

    .line 4
    .line 5
    shr-long v1, p3, v1

    .line 6
    .line 7
    long-to-int v1, v1

    .line 8
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    invoke-virtual {v0, p1, p2, v1}, LF0/c;->a(JF)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, LF0/d;->c:LF0/c;

    .line 16
    .line 17
    const-wide v1, 0xffffffffL

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    and-long/2addr p3, v1

    .line 23
    long-to-int p3, p3

    .line 24
    invoke-static {p3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 25
    .line 26
    .line 27
    move-result p3

    .line 28
    invoke-virtual {v0, p1, p2, p3}, LF0/c;->a(JF)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public final b(J)J
    .locals 2

    .line 1
    invoke-static {p1, p2}, Li1/y;->h(J)F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    cmpl-float v0, v0, v1

    .line 7
    .line 8
    if-lez v0, :cond_0

    .line 9
    .line 10
    invoke-static {p1, p2}, Li1/y;->i(J)F

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    cmpl-float v0, v0, v1

    .line 15
    .line 16
    if-lez v0, :cond_0

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    :goto_0
    if-nez v0, :cond_1

    .line 22
    .line 23
    new-instance v0, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 26
    .line 27
    .line 28
    const-string v1, "maximumVelocity should be a positive value. You specified="

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-static {p1, p2}, Li1/y;->n(J)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-static {v0}, LH0/a;->b(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    :cond_1
    iget-object v0, p0, LF0/d;->b:LF0/c;

    .line 48
    .line 49
    invoke-static {p1, p2}, Li1/y;->h(J)F

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    invoke-virtual {v0, v1}, LF0/c;->d(F)F

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    iget-object v1, p0, LF0/d;->c:LF0/c;

    .line 58
    .line 59
    invoke-static {p1, p2}, Li1/y;->i(J)F

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    invoke-virtual {v1, p1}, LF0/c;->d(F)F

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    invoke-static {v0, p1}, Li1/z;->a(FF)J

    .line 68
    .line 69
    .line 70
    move-result-wide p1

    .line 71
    return-wide p1
.end method

.method public final c()J
    .locals 2

    .line 1
    iget-wide v0, p0, LF0/d;->d:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final d()J
    .locals 2

    .line 1
    iget-wide v0, p0, LF0/d;->e:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final e()V
    .locals 2

    .line 1
    iget-object v0, p0, LF0/d;->b:LF0/c;

    .line 2
    .line 3
    invoke-virtual {v0}, LF0/c;->e()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LF0/d;->c:LF0/c;

    .line 7
    .line 8
    invoke-virtual {v0}, LF0/c;->e()V

    .line 9
    .line 10
    .line 11
    const-wide/16 v0, 0x0

    .line 12
    .line 13
    iput-wide v0, p0, LF0/d;->e:J

    .line 14
    .line 15
    return-void
.end method

.method public final f(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, LF0/d;->d:J

    .line 2
    .line 3
    return-void
.end method

.method public final g(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, LF0/d;->e:J

    .line 2
    .line 3
    return-void
.end method
