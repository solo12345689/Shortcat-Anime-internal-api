.class final LE3/W4$d;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LE3/h3$h;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LE3/W4;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "d"
.end annotation


# instance fields
.field final synthetic a:LE3/W4;


# direct methods
.method private constructor <init>(LE3/W4;)V
    .locals 0

    .line 1
    iput-object p1, p0, LE3/W4$d;->a:LE3/W4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(LE3/W4;LE3/W4$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, LE3/W4$d;-><init>(LE3/W4;)V

    return-void
.end method


# virtual methods
.method public a(LE3/h3;)V
    .locals 2

    .line 1
    iget-object v0, p0, LE3/W4$d;->a:LE3/W4;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, p1, v1}, LE3/W4;->r(LE3/h3;Z)Z

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public b(LE3/h3;)Z
    .locals 3

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1f

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-lt v0, v1, :cond_1

    .line 7
    .line 8
    const/16 v1, 0x21

    .line 9
    .line 10
    if-lt v0, v1, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    iget-object v0, p0, LE3/W4$d;->a:LE3/W4;

    .line 14
    .line 15
    invoke-static {v0}, LE3/W4;->e(LE3/W4;)LE3/g3;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, LE3/g3;->i()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    iget-object v0, p0, LE3/W4$d;->a:LE3/W4;

    .line 26
    .line 27
    invoke-virtual {v0, p1, v2}, LE3/W4;->r(LE3/h3;Z)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    return p1

    .line 32
    :cond_1
    :goto_0
    return v2
.end method
