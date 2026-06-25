.class public final LE3/Y6;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LE3/Y6$a;
    }
.end annotation


# static fields
.field private static final b:Ljava/lang/String;

.field private static final c:Ljava/lang/String;


# instance fields
.field private final a:LE3/Y6$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "media3.session"

    .line 2
    .line 3
    invoke-static {v0}, Lq2/H;->a(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-static {v0}, Lt2/a0;->H0(I)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, LE3/Y6;->b:Ljava/lang/String;

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    invoke-static {v0}, Lt2/a0;->H0(I)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    sput-object v0, LE3/Y6;->c:Ljava/lang/String;

    .line 19
    .line 20
    return-void
.end method

.method constructor <init>(IIIILjava/lang/String;LE3/r;Landroid/os/Bundle;Landroid/media/session/MediaSession$Token;)V
    .locals 9

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LE3/Z6;

    .line 5
    .line 6
    move v1, p1

    .line 7
    move v2, p2

    .line 8
    move v3, p3

    .line 9
    move v4, p4

    .line 10
    move-object v5, p5

    .line 11
    move-object v6, p6

    .line 12
    move-object/from16 v7, p7

    .line 13
    .line 14
    move-object/from16 v8, p8

    .line 15
    .line 16
    invoke-direct/range {v0 .. v8}, LE3/Z6;-><init>(IIIILjava/lang/String;LE3/r;Landroid/os/Bundle;Landroid/media/session/MediaSession$Token;)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, LE3/Y6;->a:LE3/Y6$a;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method a()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LE3/Y6;->a:LE3/Y6$a;

    .line 2
    .line 3
    invoke-interface {v0}, LE3/Y6$a;->v()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method b()Landroid/content/ComponentName;
    .locals 1

    .line 1
    iget-object v0, p0, LE3/Y6;->a:LE3/Y6$a;

    .line 2
    .line 3
    invoke-interface {v0}, LE3/Y6$a;->x()Landroid/content/ComponentName;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public c()Landroid/os/Bundle;
    .locals 1

    .line 1
    iget-object v0, p0, LE3/Y6;->a:LE3/Y6$a;

    .line 2
    .line 3
    invoke-interface {v0}, LE3/Y6$a;->getExtras()Landroid/os/Bundle;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public d()I
    .locals 1

    .line 1
    iget-object v0, p0, LE3/Y6;->a:LE3/Y6$a;

    .line 2
    .line 3
    invoke-interface {v0}, LE3/Y6$a;->w()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LE3/Y6;->a:LE3/Y6$a;

    .line 2
    .line 3
    invoke-interface {v0}, LE3/Y6$a;->r()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, LE3/Y6;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    return p1

    .line 7
    :cond_0
    check-cast p1, LE3/Y6;

    .line 8
    .line 9
    iget-object v0, p0, LE3/Y6;->a:LE3/Y6$a;

    .line 10
    .line 11
    iget-object p1, p1, LE3/Y6;->a:LE3/Y6$a;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    return p1
.end method

.method f()Landroid/media/session/MediaSession$Token;
    .locals 1

    .line 1
    iget-object v0, p0, LE3/Y6;->a:LE3/Y6$a;

    .line 2
    .line 3
    invoke-interface {v0}, LE3/Y6$a;->z()Landroid/media/session/MediaSession$Token;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public g()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LE3/Y6;->a:LE3/Y6$a;

    .line 2
    .line 3
    invoke-interface {v0}, LE3/Y6$a;->t()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public h()I
    .locals 1

    .line 1
    iget-object v0, p0, LE3/Y6;->a:LE3/Y6$a;

    .line 2
    .line 3
    invoke-interface {v0}, LE3/Y6$a;->getType()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, LE3/Y6;->a:LE3/Y6$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public i()I
    .locals 1

    .line 1
    iget-object v0, p0, LE3/Y6;->a:LE3/Y6$a;

    .line 2
    .line 3
    invoke-interface {v0}, LE3/Y6$a;->s()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method j()Z
    .locals 1

    .line 1
    iget-object v0, p0, LE3/Y6;->a:LE3/Y6$a;

    .line 2
    .line 3
    invoke-interface {v0}, LE3/Y6$a;->y()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public k()Landroid/os/Bundle;
    .locals 3

    .line 1
    new-instance v0, Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, LE3/Y6;->a:LE3/Y6$a;

    .line 7
    .line 8
    instance-of v1, v1, LE3/Z6;

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    sget-object v1, LE3/Y6;->b:Ljava/lang/String;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    sget-object v1, LE3/Y6;->b:Ljava/lang/String;

    .line 20
    .line 21
    const/4 v2, 0x1

    .line 22
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 23
    .line 24
    .line 25
    :goto_0
    sget-object v1, LE3/Y6;->c:Ljava/lang/String;

    .line 26
    .line 27
    iget-object v2, p0, LE3/Y6;->a:LE3/Y6$a;

    .line 28
    .line 29
    invoke-interface {v2}, LE3/Y6$a;->u()Landroid/os/Bundle;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 34
    .line 35
    .line 36
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LE3/Y6;->a:LE3/Y6$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
