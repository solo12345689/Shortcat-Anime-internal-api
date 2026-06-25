.class public final Lcom/facebook/react/devsupport/inspector/FrameTimingSequence;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:I

.field private final b:I

.field private final c:J

.field private final d:J

.field private final e:[B


# direct methods
.method public constructor <init>(IIJJ[B)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lcom/facebook/react/devsupport/inspector/FrameTimingSequence;->a:I

    .line 5
    .line 6
    iput p2, p0, Lcom/facebook/react/devsupport/inspector/FrameTimingSequence;->b:I

    .line 7
    .line 8
    iput-wide p3, p0, Lcom/facebook/react/devsupport/inspector/FrameTimingSequence;->c:J

    .line 9
    .line 10
    iput-wide p5, p0, Lcom/facebook/react/devsupport/inspector/FrameTimingSequence;->d:J

    .line 11
    .line 12
    iput-object p7, p0, Lcom/facebook/react/devsupport/inspector/FrameTimingSequence;->e:[B

    .line 13
    .line 14
    return-void
.end method


# virtual methods
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
    instance-of v1, p1, Lcom/facebook/react/devsupport/inspector/FrameTimingSequence;

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
    check-cast p1, Lcom/facebook/react/devsupport/inspector/FrameTimingSequence;

    .line 12
    .line 13
    iget v1, p0, Lcom/facebook/react/devsupport/inspector/FrameTimingSequence;->a:I

    .line 14
    .line 15
    iget v3, p1, Lcom/facebook/react/devsupport/inspector/FrameTimingSequence;->a:I

    .line 16
    .line 17
    if-eq v1, v3, :cond_2

    .line 18
    .line 19
    return v2

    .line 20
    :cond_2
    iget v1, p0, Lcom/facebook/react/devsupport/inspector/FrameTimingSequence;->b:I

    .line 21
    .line 22
    iget v3, p1, Lcom/facebook/react/devsupport/inspector/FrameTimingSequence;->b:I

    .line 23
    .line 24
    if-eq v1, v3, :cond_3

    .line 25
    .line 26
    return v2

    .line 27
    :cond_3
    iget-wide v3, p0, Lcom/facebook/react/devsupport/inspector/FrameTimingSequence;->c:J

    .line 28
    .line 29
    iget-wide v5, p1, Lcom/facebook/react/devsupport/inspector/FrameTimingSequence;->c:J

    .line 30
    .line 31
    cmp-long v1, v3, v5

    .line 32
    .line 33
    if-eqz v1, :cond_4

    .line 34
    .line 35
    return v2

    .line 36
    :cond_4
    iget-wide v3, p0, Lcom/facebook/react/devsupport/inspector/FrameTimingSequence;->d:J

    .line 37
    .line 38
    iget-wide v5, p1, Lcom/facebook/react/devsupport/inspector/FrameTimingSequence;->d:J

    .line 39
    .line 40
    cmp-long v1, v3, v5

    .line 41
    .line 42
    if-eqz v1, :cond_5

    .line 43
    .line 44
    return v2

    .line 45
    :cond_5
    iget-object v1, p0, Lcom/facebook/react/devsupport/inspector/FrameTimingSequence;->e:[B

    .line 46
    .line 47
    iget-object p1, p1, Lcom/facebook/react/devsupport/inspector/FrameTimingSequence;->e:[B

    .line 48
    .line 49
    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    if-nez p1, :cond_6

    .line 54
    .line 55
    return v2

    .line 56
    :cond_6
    return v0
.end method

.method public hashCode()I
    .locals 3

    .line 1
    iget v0, p0, Lcom/facebook/react/devsupport/inspector/FrameTimingSequence;->a:I

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget v1, p0, Lcom/facebook/react/devsupport/inspector/FrameTimingSequence;->b:I

    .line 10
    .line 11
    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

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
    iget-wide v1, p0, Lcom/facebook/react/devsupport/inspector/FrameTimingSequence;->c:J

    .line 19
    .line 20
    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

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
    iget-wide v1, p0, Lcom/facebook/react/devsupport/inspector/FrameTimingSequence;->d:J

    .line 28
    .line 29
    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    add-int/2addr v0, v1

    .line 34
    mul-int/lit8 v0, v0, 0x1f

    .line 35
    .line 36
    iget-object v1, p0, Lcom/facebook/react/devsupport/inspector/FrameTimingSequence;->e:[B

    .line 37
    .line 38
    if-nez v1, :cond_0

    .line 39
    .line 40
    const/4 v1, 0x0

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    invoke-static {v1}, Ljava/util/Arrays;->hashCode([B)I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    :goto_0
    add-int/2addr v0, v1

    .line 47
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    .line 1
    iget v0, p0, Lcom/facebook/react/devsupport/inspector/FrameTimingSequence;->a:I

    .line 2
    .line 3
    iget v1, p0, Lcom/facebook/react/devsupport/inspector/FrameTimingSequence;->b:I

    .line 4
    .line 5
    iget-wide v2, p0, Lcom/facebook/react/devsupport/inspector/FrameTimingSequence;->c:J

    .line 6
    .line 7
    iget-wide v4, p0, Lcom/facebook/react/devsupport/inspector/FrameTimingSequence;->d:J

    .line 8
    .line 9
    iget-object v6, p0, Lcom/facebook/react/devsupport/inspector/FrameTimingSequence;->e:[B

    .line 10
    .line 11
    invoke-static {v6}, Ljava/util/Arrays;->toString([B)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v6

    .line 15
    new-instance v7, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 18
    .line 19
    .line 20
    const-string v8, "FrameTimingSequence(id="

    .line 21
    .line 22
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v0, ", threadId="

    .line 29
    .line 30
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string v0, ", beginTimestamp="

    .line 37
    .line 38
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v7, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string v0, ", endTimestamp="

    .line 45
    .line 46
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v7, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const-string v0, ", screenshot="

    .line 53
    .line 54
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    const-string v0, ")"

    .line 61
    .line 62
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    return-object v0
.end method
