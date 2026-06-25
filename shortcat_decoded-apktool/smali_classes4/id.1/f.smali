.class public Lid/f;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lid/i;


# instance fields
.field private final a:J

.field private final b:Lid/k;


# direct methods
.method private constructor <init>(JLid/k;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-wide v0, -0x38d7ea4c67fffL

    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    cmp-long v0, p1, v0

    .line 10
    .line 11
    if-ltz v0, :cond_0

    .line 12
    .line 13
    const-wide v0, 0x38d7ea4c67fffL

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    cmp-long v0, p1, v0

    .line 19
    .line 20
    if-gtz v0, :cond_0

    .line 21
    .line 22
    iput-wide p1, p0, Lid/f;->a:J

    .line 23
    .line 24
    const-string p1, "params must not be null"

    .line 25
    .line 26
    invoke-static {p3, p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    iput-object p3, p0, Lid/f;->b:Lid/k;

    .line 30
    .line 31
    return-void

    .line 32
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 33
    .line 34
    const-string p2, "value must be in the range from -999999999999999 to 999999999999999"

    .line 35
    .line 36
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    throw p1
.end method

.method public static e(J)Lid/f;
    .locals 2

    .line 1
    new-instance v0, Lid/f;

    .line 2
    .line 3
    sget-object v1, Lid/k;->b:Lid/k;

    .line 4
    .line 5
    invoke-direct {v0, p0, p1, v1}, Lid/f;-><init>(JLid/k;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method


# virtual methods
.method public a()Lid/k;
    .locals 1

    .line 1
    iget-object v0, p0, Lid/f;->b:Lid/k;

    .line 2
    .line 3
    return-object v0
.end method

.method public bridge synthetic b(Lid/k;)Lid/g;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lid/f;->f(Lid/k;)Lid/f;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public c(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;
    .locals 2

    .line 1
    iget-wide v0, p0, Lid/f;->a:J

    .line 2
    .line 3
    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lid/f;->b:Lid/k;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Lid/k;->o(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    return-object p1
.end method

.method public d()Ljava/lang/Long;
    .locals 2

    .line 1
    iget-wide v0, p0, Lid/f;->a:J

    .line 2
    .line 3
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public f(Lid/k;)Lid/f;
    .locals 3

    .line 1
    const-string v0, "params must not be null"

    .line 2
    .line 3
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lid/k;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    return-object p0

    .line 13
    :cond_0
    new-instance v0, Lid/f;

    .line 14
    .line 15
    iget-wide v1, p0, Lid/f;->a:J

    .line 16
    .line 17
    invoke-direct {v0, v1, v2, p1}, Lid/f;-><init>(JLid/k;)V

    .line 18
    .line 19
    .line 20
    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lid/f;->d()Ljava/lang/Long;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
