.class final Lt/a$a;
.super Ljava/util/AbstractSet;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lt/a;


# direct methods
.method constructor <init>(Lt/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lt/a$a;->a:Lt/a;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/util/AbstractSet;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 2

    .line 1
    new-instance v0, Lt/a$d;

    .line 2
    .line 3
    iget-object v1, p0, Lt/a$a;->a:Lt/a;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lt/a$d;-><init>(Lt/a;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public size()I
    .locals 1

    .line 1
    iget-object v0, p0, Lt/a$a;->a:Lt/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lt/i0;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method
