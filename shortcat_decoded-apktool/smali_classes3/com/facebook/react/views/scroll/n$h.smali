.class public final Lcom/facebook/react/views/scroll/n$h;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/views/scroll/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "h"
.end annotation


# instance fields
.field private final a:Landroid/graphics/Point;

.field private b:I

.field private final c:Landroid/graphics/Point;

.field private d:Z

.field private e:Z

.field private f:F

.field private g:Z


# direct methods
.method public constructor <init>()V
    .locals 10

    .line 1
    const/16 v8, 0x7f

    const/4 v9, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v9}, Lcom/facebook/react/views/scroll/n$h;-><init>(Landroid/graphics/Point;ILandroid/graphics/Point;ZZFZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/graphics/Point;ILandroid/graphics/Point;ZZFZ)V
    .locals 1

    const-string v0, "finalAnimatedPositionScroll"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lastStateUpdateScroll"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/facebook/react/views/scroll/n$h;->a:Landroid/graphics/Point;

    .line 4
    iput p2, p0, Lcom/facebook/react/views/scroll/n$h;->b:I

    .line 5
    iput-object p3, p0, Lcom/facebook/react/views/scroll/n$h;->c:Landroid/graphics/Point;

    .line 6
    iput-boolean p4, p0, Lcom/facebook/react/views/scroll/n$h;->d:Z

    .line 7
    iput-boolean p5, p0, Lcom/facebook/react/views/scroll/n$h;->e:Z

    .line 8
    iput p6, p0, Lcom/facebook/react/views/scroll/n$h;->f:F

    .line 9
    iput-boolean p7, p0, Lcom/facebook/react/views/scroll/n$h;->g:Z

    return-void
.end method

.method public synthetic constructor <init>(Landroid/graphics/Point;ILandroid/graphics/Point;ZZFZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    .line 10
    new-instance p1, Landroid/graphics/Point;

    invoke-direct {p1}, Landroid/graphics/Point;-><init>()V

    :cond_0
    and-int/lit8 p9, p8, 0x2

    const/4 v0, 0x0

    if-eqz p9, :cond_1

    move p2, v0

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    .line 11
    new-instance p3, Landroid/graphics/Point;

    const/4 p9, -0x1

    invoke-direct {p3, p9, p9}, Landroid/graphics/Point;-><init>(II)V

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    move p4, v0

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    const/4 p5, 0x1

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    const p6, 0x3f7c28f6    # 0.985f

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    move p9, v0

    move p7, p5

    move p8, p6

    move-object p5, p3

    move p6, p4

    move-object p3, p1

    move p4, p2

    move-object p2, p0

    goto :goto_0

    :cond_6
    move p9, p7

    move p8, p6

    move p6, p4

    move p7, p5

    move p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    .line 12
    :goto_0
    invoke-direct/range {p2 .. p9}, Lcom/facebook/react/views/scroll/n$h;-><init>(Landroid/graphics/Point;ILandroid/graphics/Point;ZZFZ)V

    return-void
.end method

.method public static synthetic b(Lcom/facebook/react/views/scroll/n$h;Landroid/graphics/Point;ILandroid/graphics/Point;ZZFZILjava/lang/Object;)Lcom/facebook/react/views/scroll/n$h;
    .locals 0

    .line 1
    and-int/lit8 p9, p8, 0x1

    .line 2
    .line 3
    if-eqz p9, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lcom/facebook/react/views/scroll/n$h;->a:Landroid/graphics/Point;

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p9, p8, 0x2

    .line 8
    .line 9
    if-eqz p9, :cond_1

    .line 10
    .line 11
    iget p2, p0, Lcom/facebook/react/views/scroll/n$h;->b:I

    .line 12
    .line 13
    :cond_1
    and-int/lit8 p9, p8, 0x4

    .line 14
    .line 15
    if-eqz p9, :cond_2

    .line 16
    .line 17
    iget-object p3, p0, Lcom/facebook/react/views/scroll/n$h;->c:Landroid/graphics/Point;

    .line 18
    .line 19
    :cond_2
    and-int/lit8 p9, p8, 0x8

    .line 20
    .line 21
    if-eqz p9, :cond_3

    .line 22
    .line 23
    iget-boolean p4, p0, Lcom/facebook/react/views/scroll/n$h;->d:Z

    .line 24
    .line 25
    :cond_3
    and-int/lit8 p9, p8, 0x10

    .line 26
    .line 27
    if-eqz p9, :cond_4

    .line 28
    .line 29
    iget-boolean p5, p0, Lcom/facebook/react/views/scroll/n$h;->e:Z

    .line 30
    .line 31
    :cond_4
    and-int/lit8 p9, p8, 0x20

    .line 32
    .line 33
    if-eqz p9, :cond_5

    .line 34
    .line 35
    iget p6, p0, Lcom/facebook/react/views/scroll/n$h;->f:F

    .line 36
    .line 37
    :cond_5
    and-int/lit8 p8, p8, 0x40

    .line 38
    .line 39
    if-eqz p8, :cond_6

    .line 40
    .line 41
    iget-boolean p7, p0, Lcom/facebook/react/views/scroll/n$h;->g:Z

    .line 42
    .line 43
    :cond_6
    move p8, p6

    .line 44
    move p9, p7

    .line 45
    move p6, p4

    .line 46
    move p7, p5

    .line 47
    move p4, p2

    .line 48
    move-object p5, p3

    .line 49
    move-object p2, p0

    .line 50
    move-object p3, p1

    .line 51
    invoke-virtual/range {p2 .. p9}, Lcom/facebook/react/views/scroll/n$h;->a(Landroid/graphics/Point;ILandroid/graphics/Point;ZZFZ)Lcom/facebook/react/views/scroll/n$h;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    return-object p0
.end method


# virtual methods
.method public final a(Landroid/graphics/Point;ILandroid/graphics/Point;ZZFZ)Lcom/facebook/react/views/scroll/n$h;
    .locals 9

    .line 1
    const-string v0, "finalAnimatedPositionScroll"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "lastStateUpdateScroll"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v1, Lcom/facebook/react/views/scroll/n$h;

    .line 12
    .line 13
    move-object v2, p1

    .line 14
    move v3, p2

    .line 15
    move-object v4, p3

    .line 16
    move v5, p4

    .line 17
    move v6, p5

    .line 18
    move v7, p6

    .line 19
    move/from16 v8, p7

    .line 20
    .line 21
    invoke-direct/range {v1 .. v8}, Lcom/facebook/react/views/scroll/n$h;-><init>(Landroid/graphics/Point;ILandroid/graphics/Point;ZZFZ)V

    .line 22
    .line 23
    .line 24
    return-object v1
.end method

.method public final c()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/views/scroll/n$h;->f:F

    .line 2
    .line 3
    return v0
.end method

.method public final d()Landroid/graphics/Point;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/scroll/n$h;->a:Landroid/graphics/Point;

    .line 2
    .line 3
    return-object v0
.end method

.method public final e()Landroid/graphics/Point;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/scroll/n$h;->c:Landroid/graphics/Point;

    .line 2
    .line 3
    return-object v0
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
    instance-of v1, p1, Lcom/facebook/react/views/scroll/n$h;

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
    check-cast p1, Lcom/facebook/react/views/scroll/n$h;

    .line 12
    .line 13
    iget-object v1, p0, Lcom/facebook/react/views/scroll/n$h;->a:Landroid/graphics/Point;

    .line 14
    .line 15
    iget-object v3, p1, Lcom/facebook/react/views/scroll/n$h;->a:Landroid/graphics/Point;

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
    iget v1, p0, Lcom/facebook/react/views/scroll/n$h;->b:I

    .line 25
    .line 26
    iget v3, p1, Lcom/facebook/react/views/scroll/n$h;->b:I

    .line 27
    .line 28
    if-eq v1, v3, :cond_3

    .line 29
    .line 30
    return v2

    .line 31
    :cond_3
    iget-object v1, p0, Lcom/facebook/react/views/scroll/n$h;->c:Landroid/graphics/Point;

    .line 32
    .line 33
    iget-object v3, p1, Lcom/facebook/react/views/scroll/n$h;->c:Landroid/graphics/Point;

    .line 34
    .line 35
    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-nez v1, :cond_4

    .line 40
    .line 41
    return v2

    .line 42
    :cond_4
    iget-boolean v1, p0, Lcom/facebook/react/views/scroll/n$h;->d:Z

    .line 43
    .line 44
    iget-boolean v3, p1, Lcom/facebook/react/views/scroll/n$h;->d:Z

    .line 45
    .line 46
    if-eq v1, v3, :cond_5

    .line 47
    .line 48
    return v2

    .line 49
    :cond_5
    iget-boolean v1, p0, Lcom/facebook/react/views/scroll/n$h;->e:Z

    .line 50
    .line 51
    iget-boolean v3, p1, Lcom/facebook/react/views/scroll/n$h;->e:Z

    .line 52
    .line 53
    if-eq v1, v3, :cond_6

    .line 54
    .line 55
    return v2

    .line 56
    :cond_6
    iget v1, p0, Lcom/facebook/react/views/scroll/n$h;->f:F

    .line 57
    .line 58
    iget v3, p1, Lcom/facebook/react/views/scroll/n$h;->f:F

    .line 59
    .line 60
    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    if-eqz v1, :cond_7

    .line 65
    .line 66
    return v2

    .line 67
    :cond_7
    iget-boolean v1, p0, Lcom/facebook/react/views/scroll/n$h;->g:Z

    .line 68
    .line 69
    iget-boolean p1, p1, Lcom/facebook/react/views/scroll/n$h;->g:Z

    .line 70
    .line 71
    if-eq v1, p1, :cond_8

    .line 72
    .line 73
    return v2

    .line 74
    :cond_8
    return v0
.end method

.method public final f()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/views/scroll/n$h;->b:I

    .line 2
    .line 3
    return v0
.end method

.method public final g()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/views/scroll/n$h;->d:Z

    .line 2
    .line 3
    return v0
.end method

.method public final h()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/views/scroll/n$h;->e:Z

    .line 2
    .line 3
    return v0
.end method

.method public hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/scroll/n$h;->a:Landroid/graphics/Point;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/graphics/Point;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget v1, p0, Lcom/facebook/react/views/scroll/n$h;->b:I

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
    iget-object v1, p0, Lcom/facebook/react/views/scroll/n$h;->c:Landroid/graphics/Point;

    .line 19
    .line 20
    invoke-virtual {v1}, Landroid/graphics/Point;->hashCode()I

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
    iget-boolean v1, p0, Lcom/facebook/react/views/scroll/n$h;->d:Z

    .line 28
    .line 29
    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

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
    iget-boolean v1, p0, Lcom/facebook/react/views/scroll/n$h;->e:Z

    .line 37
    .line 38
    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    add-int/2addr v0, v1

    .line 43
    mul-int/lit8 v0, v0, 0x1f

    .line 44
    .line 45
    iget v1, p0, Lcom/facebook/react/views/scroll/n$h;->f:F

    .line 46
    .line 47
    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    add-int/2addr v0, v1

    .line 52
    mul-int/lit8 v0, v0, 0x1f

    .line 53
    .line 54
    iget-boolean v1, p0, Lcom/facebook/react/views/scroll/n$h;->g:Z

    .line 55
    .line 56
    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    add-int/2addr v0, v1

    .line 61
    return v0
.end method

.method public final i()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/views/scroll/n$h;->g:Z

    .line 2
    .line 3
    return v0
.end method

.method public final j(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/facebook/react/views/scroll/n$h;->d:Z

    .line 2
    .line 3
    return-void
.end method

.method public final k(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/facebook/react/views/scroll/n$h;->f:F

    .line 2
    .line 3
    return-void
.end method

.method public final l(II)Lcom/facebook/react/views/scroll/n$h;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/scroll/n$h;->a:Landroid/graphics/Point;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Landroid/graphics/Point;->set(II)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public final m(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/facebook/react/views/scroll/n$h;->e:Z

    .line 2
    .line 3
    return-void
.end method

.method public final n(II)Lcom/facebook/react/views/scroll/n$h;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/scroll/n$h;->c:Landroid/graphics/Point;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Landroid/graphics/Point;->set(II)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public final o(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/facebook/react/views/scroll/n$h;->b:I

    .line 2
    .line 3
    return-void
.end method

.method public final p(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/facebook/react/views/scroll/n$h;->g:Z

    .line 2
    .line 3
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/scroll/n$h;->a:Landroid/graphics/Point;

    .line 2
    .line 3
    iget v1, p0, Lcom/facebook/react/views/scroll/n$h;->b:I

    .line 4
    .line 5
    iget-object v2, p0, Lcom/facebook/react/views/scroll/n$h;->c:Landroid/graphics/Point;

    .line 6
    .line 7
    iget-boolean v3, p0, Lcom/facebook/react/views/scroll/n$h;->d:Z

    .line 8
    .line 9
    iget-boolean v4, p0, Lcom/facebook/react/views/scroll/n$h;->e:Z

    .line 10
    .line 11
    iget v5, p0, Lcom/facebook/react/views/scroll/n$h;->f:F

    .line 12
    .line 13
    iget-boolean v6, p0, Lcom/facebook/react/views/scroll/n$h;->g:Z

    .line 14
    .line 15
    new-instance v7, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 18
    .line 19
    .line 20
    const-string v8, "ReactScrollViewScrollState(finalAnimatedPositionScroll="

    .line 21
    .line 22
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v0, ", scrollAwayPaddingTop="

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
    const-string v0, ", lastStateUpdateScroll="

    .line 37
    .line 38
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string v0, ", isCanceled="

    .line 45
    .line 46
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const-string v0, ", isFinished="

    .line 53
    .line 54
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    const-string v0, ", decelerationRate="

    .line 61
    .line 62
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    const-string v0, ", isUpdatedByScroll="

    .line 69
    .line 70
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    const-string v0, ")"

    .line 77
    .line 78
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    return-object v0
.end method
