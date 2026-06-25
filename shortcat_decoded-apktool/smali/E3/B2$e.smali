.class final LE3/B2$e;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LE3/B2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "e"
.end annotation


# instance fields
.field public final a:LF3/j$e;

.field public final b:LF3/v;

.field public final c:LF3/m;

.field public final d:Ljava/util/List;

.field public final e:Ljava/lang/CharSequence;

.field public final f:I

.field public final g:I

.field public final h:Landroid/os/Bundle;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, LE3/B2$e;->a:LF3/j$e;

    .line 3
    iput-object v0, p0, LE3/B2$e;->b:LF3/v;

    .line 4
    iput-object v0, p0, LE3/B2$e;->c:LF3/m;

    .line 5
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v1, p0, LE3/B2$e;->d:Ljava/util/List;

    .line 6
    iput-object v0, p0, LE3/B2$e;->e:Ljava/lang/CharSequence;

    const/4 v0, 0x0

    .line 7
    iput v0, p0, LE3/B2$e;->f:I

    .line 8
    iput v0, p0, LE3/B2$e;->g:I

    .line 9
    sget-object v0, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    iput-object v0, p0, LE3/B2$e;->h:Landroid/os/Bundle;

    return-void
.end method

.method public constructor <init>(LE3/B2$e;)V
    .locals 1

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iget-object v0, p1, LE3/B2$e;->a:LF3/j$e;

    iput-object v0, p0, LE3/B2$e;->a:LF3/j$e;

    .line 21
    iget-object v0, p1, LE3/B2$e;->b:LF3/v;

    iput-object v0, p0, LE3/B2$e;->b:LF3/v;

    .line 22
    iget-object v0, p1, LE3/B2$e;->c:LF3/m;

    iput-object v0, p0, LE3/B2$e;->c:LF3/m;

    .line 23
    iget-object v0, p1, LE3/B2$e;->d:Ljava/util/List;

    iput-object v0, p0, LE3/B2$e;->d:Ljava/util/List;

    .line 24
    iget-object v0, p1, LE3/B2$e;->e:Ljava/lang/CharSequence;

    iput-object v0, p0, LE3/B2$e;->e:Ljava/lang/CharSequence;

    .line 25
    iget v0, p1, LE3/B2$e;->f:I

    iput v0, p0, LE3/B2$e;->f:I

    .line 26
    iget v0, p1, LE3/B2$e;->g:I

    iput v0, p0, LE3/B2$e;->g:I

    .line 27
    iget-object p1, p1, LE3/B2$e;->h:Landroid/os/Bundle;

    iput-object p1, p0, LE3/B2$e;->h:Landroid/os/Bundle;

    return-void
.end method

.method public constructor <init>(LF3/j$e;LF3/v;LF3/m;Ljava/util/List;Ljava/lang/CharSequence;IILandroid/os/Bundle;)V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    iput-object p1, p0, LE3/B2$e;->a:LF3/j$e;

    .line 12
    iput-object p2, p0, LE3/B2$e;->b:LF3/v;

    .line 13
    iput-object p3, p0, LE3/B2$e;->c:LF3/m;

    .line 14
    invoke-static {p4}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    iput-object p1, p0, LE3/B2$e;->d:Ljava/util/List;

    .line 15
    iput-object p5, p0, LE3/B2$e;->e:Ljava/lang/CharSequence;

    .line 16
    iput p6, p0, LE3/B2$e;->f:I

    .line 17
    iput p7, p0, LE3/B2$e;->g:I

    if-eqz p8, :cond_0

    goto :goto_0

    .line 18
    :cond_0
    sget-object p8, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    :goto_0
    iput-object p8, p0, LE3/B2$e;->h:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public a(LF3/v;II)LE3/B2$e;
    .locals 9

    .line 1
    new-instance v0, LE3/B2$e;

    .line 2
    .line 3
    iget-object v1, p0, LE3/B2$e;->a:LF3/j$e;

    .line 4
    .line 5
    iget-object v3, p0, LE3/B2$e;->c:LF3/m;

    .line 6
    .line 7
    iget-object v4, p0, LE3/B2$e;->d:Ljava/util/List;

    .line 8
    .line 9
    iget-object v5, p0, LE3/B2$e;->e:Ljava/lang/CharSequence;

    .line 10
    .line 11
    iget-object v8, p0, LE3/B2$e;->h:Landroid/os/Bundle;

    .line 12
    .line 13
    move-object v2, p1

    .line 14
    move v6, p2

    .line 15
    move v7, p3

    .line 16
    invoke-direct/range {v0 .. v8}, LE3/B2$e;-><init>(LF3/j$e;LF3/v;LF3/m;Ljava/util/List;Ljava/lang/CharSequence;IILandroid/os/Bundle;)V

    .line 17
    .line 18
    .line 19
    return-object v0
.end method

.method public b(LF3/m;)LE3/B2$e;
    .locals 9

    .line 1
    new-instance v0, LE3/B2$e;

    .line 2
    .line 3
    iget-object v1, p0, LE3/B2$e;->a:LF3/j$e;

    .line 4
    .line 5
    iget-object v2, p0, LE3/B2$e;->b:LF3/v;

    .line 6
    .line 7
    iget-object v4, p0, LE3/B2$e;->d:Ljava/util/List;

    .line 8
    .line 9
    iget-object v5, p0, LE3/B2$e;->e:Ljava/lang/CharSequence;

    .line 10
    .line 11
    iget v6, p0, LE3/B2$e;->f:I

    .line 12
    .line 13
    iget v7, p0, LE3/B2$e;->g:I

    .line 14
    .line 15
    iget-object v8, p0, LE3/B2$e;->h:Landroid/os/Bundle;

    .line 16
    .line 17
    move-object v3, p1

    .line 18
    invoke-direct/range {v0 .. v8}, LE3/B2$e;-><init>(LF3/j$e;LF3/v;LF3/m;Ljava/util/List;Ljava/lang/CharSequence;IILandroid/os/Bundle;)V

    .line 19
    .line 20
    .line 21
    return-object v0
.end method

.method public c(LF3/j$e;)LE3/B2$e;
    .locals 9

    .line 1
    new-instance v0, LE3/B2$e;

    .line 2
    .line 3
    iget-object v2, p0, LE3/B2$e;->b:LF3/v;

    .line 4
    .line 5
    iget-object v3, p0, LE3/B2$e;->c:LF3/m;

    .line 6
    .line 7
    iget-object v4, p0, LE3/B2$e;->d:Ljava/util/List;

    .line 8
    .line 9
    iget-object v5, p0, LE3/B2$e;->e:Ljava/lang/CharSequence;

    .line 10
    .line 11
    iget v6, p0, LE3/B2$e;->f:I

    .line 12
    .line 13
    iget v7, p0, LE3/B2$e;->g:I

    .line 14
    .line 15
    iget-object v8, p0, LE3/B2$e;->h:Landroid/os/Bundle;

    .line 16
    .line 17
    move-object v1, p1

    .line 18
    invoke-direct/range {v0 .. v8}, LE3/B2$e;-><init>(LF3/j$e;LF3/v;LF3/m;Ljava/util/List;Ljava/lang/CharSequence;IILandroid/os/Bundle;)V

    .line 19
    .line 20
    .line 21
    return-object v0
.end method

.method public d(LF3/v;)LE3/B2$e;
    .locals 9

    .line 1
    new-instance v0, LE3/B2$e;

    .line 2
    .line 3
    iget-object v1, p0, LE3/B2$e;->a:LF3/j$e;

    .line 4
    .line 5
    iget-object v3, p0, LE3/B2$e;->c:LF3/m;

    .line 6
    .line 7
    iget-object v4, p0, LE3/B2$e;->d:Ljava/util/List;

    .line 8
    .line 9
    iget-object v5, p0, LE3/B2$e;->e:Ljava/lang/CharSequence;

    .line 10
    .line 11
    iget v6, p0, LE3/B2$e;->f:I

    .line 12
    .line 13
    iget v7, p0, LE3/B2$e;->g:I

    .line 14
    .line 15
    iget-object v8, p0, LE3/B2$e;->h:Landroid/os/Bundle;

    .line 16
    .line 17
    move-object v2, p1

    .line 18
    invoke-direct/range {v0 .. v8}, LE3/B2$e;-><init>(LF3/j$e;LF3/v;LF3/m;Ljava/util/List;Ljava/lang/CharSequence;IILandroid/os/Bundle;)V

    .line 19
    .line 20
    .line 21
    return-object v0
.end method

.method public e(Ljava/util/List;)LE3/B2$e;
    .locals 9

    .line 1
    new-instance v0, LE3/B2$e;

    .line 2
    .line 3
    iget-object v1, p0, LE3/B2$e;->a:LF3/j$e;

    .line 4
    .line 5
    iget-object v2, p0, LE3/B2$e;->b:LF3/v;

    .line 6
    .line 7
    iget-object v3, p0, LE3/B2$e;->c:LF3/m;

    .line 8
    .line 9
    iget-object v5, p0, LE3/B2$e;->e:Ljava/lang/CharSequence;

    .line 10
    .line 11
    iget v6, p0, LE3/B2$e;->f:I

    .line 12
    .line 13
    iget v7, p0, LE3/B2$e;->g:I

    .line 14
    .line 15
    iget-object v8, p0, LE3/B2$e;->h:Landroid/os/Bundle;

    .line 16
    .line 17
    move-object v4, p1

    .line 18
    invoke-direct/range {v0 .. v8}, LE3/B2$e;-><init>(LF3/j$e;LF3/v;LF3/m;Ljava/util/List;Ljava/lang/CharSequence;IILandroid/os/Bundle;)V

    .line 19
    .line 20
    .line 21
    return-object v0
.end method

.method public f(Ljava/lang/CharSequence;)LE3/B2$e;
    .locals 9

    .line 1
    new-instance v0, LE3/B2$e;

    .line 2
    .line 3
    iget-object v1, p0, LE3/B2$e;->a:LF3/j$e;

    .line 4
    .line 5
    iget-object v2, p0, LE3/B2$e;->b:LF3/v;

    .line 6
    .line 7
    iget-object v3, p0, LE3/B2$e;->c:LF3/m;

    .line 8
    .line 9
    iget-object v4, p0, LE3/B2$e;->d:Ljava/util/List;

    .line 10
    .line 11
    iget v6, p0, LE3/B2$e;->f:I

    .line 12
    .line 13
    iget v7, p0, LE3/B2$e;->g:I

    .line 14
    .line 15
    iget-object v8, p0, LE3/B2$e;->h:Landroid/os/Bundle;

    .line 16
    .line 17
    move-object v5, p1

    .line 18
    invoke-direct/range {v0 .. v8}, LE3/B2$e;-><init>(LF3/j$e;LF3/v;LF3/m;Ljava/util/List;Ljava/lang/CharSequence;IILandroid/os/Bundle;)V

    .line 19
    .line 20
    .line 21
    return-object v0
.end method

.method public g(I)LE3/B2$e;
    .locals 9

    .line 1
    new-instance v0, LE3/B2$e;

    .line 2
    .line 3
    iget-object v1, p0, LE3/B2$e;->a:LF3/j$e;

    .line 4
    .line 5
    iget-object v2, p0, LE3/B2$e;->b:LF3/v;

    .line 6
    .line 7
    iget-object v3, p0, LE3/B2$e;->c:LF3/m;

    .line 8
    .line 9
    iget-object v4, p0, LE3/B2$e;->d:Ljava/util/List;

    .line 10
    .line 11
    iget-object v5, p0, LE3/B2$e;->e:Ljava/lang/CharSequence;

    .line 12
    .line 13
    iget v7, p0, LE3/B2$e;->g:I

    .line 14
    .line 15
    iget-object v8, p0, LE3/B2$e;->h:Landroid/os/Bundle;

    .line 16
    .line 17
    move v6, p1

    .line 18
    invoke-direct/range {v0 .. v8}, LE3/B2$e;-><init>(LF3/j$e;LF3/v;LF3/m;Ljava/util/List;Ljava/lang/CharSequence;IILandroid/os/Bundle;)V

    .line 19
    .line 20
    .line 21
    return-object v0
.end method

.method public h(Landroid/os/Bundle;)LE3/B2$e;
    .locals 9

    .line 1
    new-instance v0, LE3/B2$e;

    .line 2
    .line 3
    iget-object v1, p0, LE3/B2$e;->a:LF3/j$e;

    .line 4
    .line 5
    iget-object v2, p0, LE3/B2$e;->b:LF3/v;

    .line 6
    .line 7
    iget-object v3, p0, LE3/B2$e;->c:LF3/m;

    .line 8
    .line 9
    iget-object v4, p0, LE3/B2$e;->d:Ljava/util/List;

    .line 10
    .line 11
    iget-object v5, p0, LE3/B2$e;->e:Ljava/lang/CharSequence;

    .line 12
    .line 13
    iget v6, p0, LE3/B2$e;->f:I

    .line 14
    .line 15
    iget v7, p0, LE3/B2$e;->g:I

    .line 16
    .line 17
    move-object v8, p1

    .line 18
    invoke-direct/range {v0 .. v8}, LE3/B2$e;-><init>(LF3/j$e;LF3/v;LF3/m;Ljava/util/List;Ljava/lang/CharSequence;IILandroid/os/Bundle;)V

    .line 19
    .line 20
    .line 21
    return-object v0
.end method

.method public i(I)LE3/B2$e;
    .locals 9

    .line 1
    new-instance v0, LE3/B2$e;

    .line 2
    .line 3
    iget-object v1, p0, LE3/B2$e;->a:LF3/j$e;

    .line 4
    .line 5
    iget-object v2, p0, LE3/B2$e;->b:LF3/v;

    .line 6
    .line 7
    iget-object v3, p0, LE3/B2$e;->c:LF3/m;

    .line 8
    .line 9
    iget-object v4, p0, LE3/B2$e;->d:Ljava/util/List;

    .line 10
    .line 11
    iget-object v5, p0, LE3/B2$e;->e:Ljava/lang/CharSequence;

    .line 12
    .line 13
    iget v6, p0, LE3/B2$e;->f:I

    .line 14
    .line 15
    iget-object v8, p0, LE3/B2$e;->h:Landroid/os/Bundle;

    .line 16
    .line 17
    move v7, p1

    .line 18
    invoke-direct/range {v0 .. v8}, LE3/B2$e;-><init>(LF3/j$e;LF3/v;LF3/m;Ljava/util/List;Ljava/lang/CharSequence;IILandroid/os/Bundle;)V

    .line 19
    .line 20
    .line 21
    return-object v0
.end method
