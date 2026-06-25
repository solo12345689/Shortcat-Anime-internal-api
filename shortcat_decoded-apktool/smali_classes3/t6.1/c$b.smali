.class Lt6/c$b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ls5/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt6/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field private final a:Ls5/d;

.field private final b:I


# direct methods
.method public constructor <init>(Ls5/d;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lt6/c$b;->a:Ls5/d;

    .line 5
    .line 6
    iput p2, p0, Lt6/c$b;->b:I

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public b(Landroid/net/Uri;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lt6/c$b;->a:Ls5/d;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ls5/d;->b(Landroid/net/Uri;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public c()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p1, p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lt6/c$b;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    check-cast p1, Lt6/c$b;

    .line 11
    .line 12
    iget v1, p0, Lt6/c$b;->b:I

    .line 13
    .line 14
    iget v3, p1, Lt6/c$b;->b:I

    .line 15
    .line 16
    if-ne v1, v3, :cond_1

    .line 17
    .line 18
    iget-object v1, p0, Lt6/c$b;->a:Ls5/d;

    .line 19
    .line 20
    iget-object p1, p1, Lt6/c$b;->a:Ls5/d;

    .line 21
    .line 22
    invoke-interface {v1, p1}, Ls5/d;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    return v0

    .line 29
    :cond_1
    return v2
.end method

.method public hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Lt6/c$b;->a:Ls5/d;

    .line 2
    .line 3
    invoke-interface {v0}, Ls5/d;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit16 v0, v0, 0x3f5

    .line 8
    .line 9
    iget v1, p0, Lt6/c$b;->b:I

    .line 10
    .line 11
    add-int/2addr v0, v1

    .line 12
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    invoke-static {p0}, Ly5/i;->b(Ljava/lang/Object;)Ly5/i$a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "imageCacheKey"

    .line 6
    .line 7
    iget-object v2, p0, Lt6/c$b;->a:Ls5/d;

    .line 8
    .line 9
    invoke-virtual {v0, v1, v2}, Ly5/i$a;->b(Ljava/lang/String;Ljava/lang/Object;)Ly5/i$a;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v1, "frameIndex"

    .line 14
    .line 15
    iget v2, p0, Lt6/c$b;->b:I

    .line 16
    .line 17
    invoke-virtual {v0, v1, v2}, Ly5/i$a;->a(Ljava/lang/String;I)Ly5/i$a;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Ly5/i$a;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    return-object v0
.end method
