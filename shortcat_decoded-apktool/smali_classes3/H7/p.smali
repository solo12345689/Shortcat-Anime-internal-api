.class public final LH7/p;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:LH7/q;

.field private final b:LH7/q;

.field private final c:LH7/q;

.field private final d:LH7/q;


# direct methods
.method public constructor <init>(LH7/q;LH7/q;LH7/q;LH7/q;)V
    .locals 1

    .line 1
    const-string v0, "topLeft"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "topRight"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "bottomLeft"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "bottomRight"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, LH7/p;->a:LH7/q;

    .line 25
    .line 26
    iput-object p2, p0, LH7/p;->b:LH7/q;

    .line 27
    .line 28
    iput-object p3, p0, LH7/p;->c:LH7/q;

    .line 29
    .line 30
    iput-object p4, p0, LH7/p;->d:LH7/q;

    .line 31
    .line 32
    return-void
.end method


# virtual methods
.method public final a()LH7/q;
    .locals 1

    .line 1
    iget-object v0, p0, LH7/p;->c:LH7/q;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()LH7/q;
    .locals 1

    .line 1
    iget-object v0, p0, LH7/p;->d:LH7/q;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c()LH7/q;
    .locals 1

    .line 1
    iget-object v0, p0, LH7/p;->a:LH7/q;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d()LH7/q;
    .locals 1

    .line 1
    iget-object v0, p0, LH7/p;->b:LH7/q;

    .line 2
    .line 3
    return-object v0
.end method

.method public final e()Z
    .locals 2

    .line 1
    iget-object v0, p0, LH7/p;->a:LH7/q;

    .line 2
    .line 3
    invoke-virtual {v0}, LH7/q;->a()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    cmpl-float v0, v0, v1

    .line 9
    .line 10
    if-gtz v0, :cond_1

    .line 11
    .line 12
    iget-object v0, p0, LH7/p;->a:LH7/q;

    .line 13
    .line 14
    invoke-virtual {v0}, LH7/q;->b()F

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    cmpl-float v0, v0, v1

    .line 19
    .line 20
    if-gtz v0, :cond_1

    .line 21
    .line 22
    iget-object v0, p0, LH7/p;->b:LH7/q;

    .line 23
    .line 24
    invoke-virtual {v0}, LH7/q;->a()F

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    cmpl-float v0, v0, v1

    .line 29
    .line 30
    if-gtz v0, :cond_1

    .line 31
    .line 32
    iget-object v0, p0, LH7/p;->b:LH7/q;

    .line 33
    .line 34
    invoke-virtual {v0}, LH7/q;->b()F

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    cmpl-float v0, v0, v1

    .line 39
    .line 40
    if-gtz v0, :cond_1

    .line 41
    .line 42
    iget-object v0, p0, LH7/p;->c:LH7/q;

    .line 43
    .line 44
    invoke-virtual {v0}, LH7/q;->a()F

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    cmpl-float v0, v0, v1

    .line 49
    .line 50
    if-gtz v0, :cond_1

    .line 51
    .line 52
    iget-object v0, p0, LH7/p;->c:LH7/q;

    .line 53
    .line 54
    invoke-virtual {v0}, LH7/q;->b()F

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    cmpl-float v0, v0, v1

    .line 59
    .line 60
    if-gtz v0, :cond_1

    .line 61
    .line 62
    iget-object v0, p0, LH7/p;->d:LH7/q;

    .line 63
    .line 64
    invoke-virtual {v0}, LH7/q;->a()F

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    cmpl-float v0, v0, v1

    .line 69
    .line 70
    if-lez v0, :cond_0

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_0
    const/4 v0, 0x0

    .line 74
    return v0

    .line 75
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 76
    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, LH7/p;

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
    check-cast p1, LH7/p;

    .line 12
    .line 13
    iget-object v1, p0, LH7/p;->a:LH7/q;

    .line 14
    .line 15
    iget-object v3, p1, LH7/p;->a:LH7/q;

    .line 16
    .line 17
    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    iget-object v1, p0, LH7/p;->b:LH7/q;

    .line 25
    .line 26
    iget-object v3, p1, LH7/p;->b:LH7/q;

    .line 27
    .line 28
    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_3

    .line 33
    .line 34
    return v2

    .line 35
    :cond_3
    iget-object v1, p0, LH7/p;->c:LH7/q;

    .line 36
    .line 37
    iget-object v3, p1, LH7/p;->c:LH7/q;

    .line 38
    .line 39
    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-nez v1, :cond_4

    .line 44
    .line 45
    return v2

    .line 46
    :cond_4
    iget-object v1, p0, LH7/p;->d:LH7/q;

    .line 47
    .line 48
    iget-object p1, p1, LH7/p;->d:LH7/q;

    .line 49
    .line 50
    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    if-nez p1, :cond_5

    .line 55
    .line 56
    return v2

    .line 57
    :cond_5
    return v0
.end method

.method public final f()Z
    .locals 2

    .line 1
    iget-object v0, p0, LH7/p;->a:LH7/q;

    .line 2
    .line 3
    iget-object v1, p0, LH7/p;->b:LH7/q;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, LH7/p;->a:LH7/q;

    .line 12
    .line 13
    iget-object v1, p0, LH7/p;->c:LH7/q;

    .line 14
    .line 15
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    iget-object v0, p0, LH7/p;->a:LH7/q;

    .line 22
    .line 23
    iget-object v1, p0, LH7/p;->d:LH7/q;

    .line 24
    .line 25
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    const/4 v0, 0x1

    .line 32
    return v0

    .line 33
    :cond_0
    const/4 v0, 0x0

    .line 34
    return v0
.end method

.method public hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, LH7/p;->a:LH7/q;

    .line 2
    .line 3
    invoke-virtual {v0}, LH7/q;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object v1, p0, LH7/p;->b:LH7/q;

    .line 10
    .line 11
    invoke-virtual {v1}, LH7/q;->hashCode()I

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
    iget-object v1, p0, LH7/p;->c:LH7/q;

    .line 19
    .line 20
    invoke-virtual {v1}, LH7/q;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    add-int/2addr v0, v1

    .line 25
    mul-int/lit8 v0, v0, 0x1f

    .line 26
    .line 27
    iget-object v1, p0, LH7/p;->d:LH7/q;

    .line 28
    .line 29
    invoke-virtual {v1}, LH7/q;->hashCode()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    add-int/2addr v0, v1

    .line 34
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    .line 1
    iget-object v0, p0, LH7/p;->a:LH7/q;

    .line 2
    .line 3
    iget-object v1, p0, LH7/p;->b:LH7/q;

    .line 4
    .line 5
    iget-object v2, p0, LH7/p;->c:LH7/q;

    .line 6
    .line 7
    iget-object v3, p0, LH7/p;->d:LH7/q;

    .line 8
    .line 9
    new-instance v4, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    .line 14
    const-string v5, "ComputedBorderRadius(topLeft="

    .line 15
    .line 16
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const-string v0, ", topRight="

    .line 23
    .line 24
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v0, ", bottomLeft="

    .line 31
    .line 32
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    const-string v0, ", bottomRight="

    .line 39
    .line 40
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const-string v0, ")"

    .line 47
    .line 48
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    return-object v0
.end method
