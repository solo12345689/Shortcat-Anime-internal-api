.class final LC2/P$h;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LC2/P;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "h"
.end annotation


# instance fields
.field public final a:Lq2/x;

.field public final b:I

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:I

.field public final g:I

.field public final h:I

.field public final i:Lr2/n;

.field public final j:Z

.field public final k:Z

.field public final l:Z


# direct methods
.method public constructor <init>(Lq2/x;IIIIIIILr2/n;ZZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LC2/P$h;->a:Lq2/x;

    .line 5
    .line 6
    iput p2, p0, LC2/P$h;->b:I

    .line 7
    .line 8
    iput p3, p0, LC2/P$h;->c:I

    .line 9
    .line 10
    iput p4, p0, LC2/P$h;->d:I

    .line 11
    .line 12
    iput p5, p0, LC2/P$h;->e:I

    .line 13
    .line 14
    iput p6, p0, LC2/P$h;->f:I

    .line 15
    .line 16
    iput p7, p0, LC2/P$h;->g:I

    .line 17
    .line 18
    iput p8, p0, LC2/P$h;->h:I

    .line 19
    .line 20
    iput-object p9, p0, LC2/P$h;->i:Lr2/n;

    .line 21
    .line 22
    iput-boolean p10, p0, LC2/P$h;->j:Z

    .line 23
    .line 24
    iput-boolean p11, p0, LC2/P$h;->k:Z

    .line 25
    .line 26
    iput-boolean p12, p0, LC2/P$h;->l:Z

    .line 27
    .line 28
    return-void
.end method


# virtual methods
.method public a()LC2/z$a;
    .locals 7

    .line 1
    new-instance v0, LC2/z$a;

    .line 2
    .line 3
    iget v1, p0, LC2/P$h;->g:I

    .line 4
    .line 5
    iget v2, p0, LC2/P$h;->e:I

    .line 6
    .line 7
    iget v3, p0, LC2/P$h;->f:I

    .line 8
    .line 9
    iget-boolean v4, p0, LC2/P$h;->l:Z

    .line 10
    .line 11
    iget v5, p0, LC2/P$h;->c:I

    .line 12
    .line 13
    const/4 v6, 0x1

    .line 14
    if-ne v5, v6, :cond_0

    .line 15
    .line 16
    :goto_0
    move v5, v6

    .line 17
    goto :goto_1

    .line 18
    :cond_0
    const/4 v6, 0x0

    .line 19
    goto :goto_0

    .line 20
    :goto_1
    iget v6, p0, LC2/P$h;->h:I

    .line 21
    .line 22
    invoke-direct/range {v0 .. v6}, LC2/z$a;-><init>(IIIZZI)V

    .line 23
    .line 24
    .line 25
    return-object v0
.end method

.method public b(LC2/P$h;)Z
    .locals 2

    .line 1
    iget v0, p1, LC2/P$h;->c:I

    .line 2
    .line 3
    iget v1, p0, LC2/P$h;->c:I

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    iget v0, p1, LC2/P$h;->g:I

    .line 8
    .line 9
    iget v1, p0, LC2/P$h;->g:I

    .line 10
    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    iget v0, p1, LC2/P$h;->e:I

    .line 14
    .line 15
    iget v1, p0, LC2/P$h;->e:I

    .line 16
    .line 17
    if-ne v0, v1, :cond_0

    .line 18
    .line 19
    iget v0, p1, LC2/P$h;->f:I

    .line 20
    .line 21
    iget v1, p0, LC2/P$h;->f:I

    .line 22
    .line 23
    if-ne v0, v1, :cond_0

    .line 24
    .line 25
    iget v0, p1, LC2/P$h;->d:I

    .line 26
    .line 27
    iget v1, p0, LC2/P$h;->d:I

    .line 28
    .line 29
    if-ne v0, v1, :cond_0

    .line 30
    .line 31
    iget-boolean v0, p1, LC2/P$h;->j:Z

    .line 32
    .line 33
    iget-boolean v1, p0, LC2/P$h;->j:Z

    .line 34
    .line 35
    if-ne v0, v1, :cond_0

    .line 36
    .line 37
    iget-boolean p1, p1, LC2/P$h;->k:Z

    .line 38
    .line 39
    iget-boolean v0, p0, LC2/P$h;->k:Z

    .line 40
    .line 41
    if-ne p1, v0, :cond_0

    .line 42
    .line 43
    const/4 p1, 0x1

    .line 44
    return p1

    .line 45
    :cond_0
    const/4 p1, 0x0

    .line 46
    return p1
.end method

.method public c(I)LC2/P$h;
    .locals 13

    .line 1
    new-instance v0, LC2/P$h;

    .line 2
    .line 3
    iget-object v1, p0, LC2/P$h;->a:Lq2/x;

    .line 4
    .line 5
    iget v2, p0, LC2/P$h;->b:I

    .line 6
    .line 7
    iget v3, p0, LC2/P$h;->c:I

    .line 8
    .line 9
    iget v4, p0, LC2/P$h;->d:I

    .line 10
    .line 11
    iget v5, p0, LC2/P$h;->e:I

    .line 12
    .line 13
    iget v6, p0, LC2/P$h;->f:I

    .line 14
    .line 15
    iget v7, p0, LC2/P$h;->g:I

    .line 16
    .line 17
    iget-object v9, p0, LC2/P$h;->i:Lr2/n;

    .line 18
    .line 19
    iget-boolean v10, p0, LC2/P$h;->j:Z

    .line 20
    .line 21
    iget-boolean v11, p0, LC2/P$h;->k:Z

    .line 22
    .line 23
    iget-boolean v12, p0, LC2/P$h;->l:Z

    .line 24
    .line 25
    move v8, p1

    .line 26
    invoke-direct/range {v0 .. v12}, LC2/P$h;-><init>(Lq2/x;IIIIIIILr2/n;ZZZ)V

    .line 27
    .line 28
    .line 29
    return-object v0
.end method

.method public d(J)J
    .locals 1

    .line 1
    iget v0, p0, LC2/P$h;->e:I

    .line 2
    .line 3
    invoke-static {p1, p2, v0}, Lt2/a0;->l1(JI)J

    .line 4
    .line 5
    .line 6
    move-result-wide p1

    .line 7
    return-wide p1
.end method

.method public e(J)J
    .locals 1

    .line 1
    iget-object v0, p0, LC2/P$h;->a:Lq2/x;

    .line 2
    .line 3
    iget v0, v0, Lq2/x;->H:I

    .line 4
    .line 5
    invoke-static {p1, p2, v0}, Lt2/a0;->l1(JI)J

    .line 6
    .line 7
    .line 8
    move-result-wide p1

    .line 9
    return-wide p1
.end method

.method public f()Z
    .locals 2

    .line 1
    iget v0, p0, LC2/P$h;->c:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
.end method
