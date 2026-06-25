.class public final Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer$d;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/util/Iterator;
.implements Lje/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;->iterator()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private a:I

.field private final b:I

.field final synthetic c:Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;


# direct methods
.method constructor <init>(Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer$d;->c:Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;->getCount()I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    add-int/lit8 p1, p1, -0x1

    .line 11
    .line 12
    iput p1, p0, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer$d;->b:I

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public b()Lcom/facebook/react/common/mapbuffer/a$c;
    .locals 4

    .line 1
    new-instance v0, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer$b;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer$d;->c:Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;

    .line 4
    .line 5
    iget v2, p0, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer$d;->a:I

    .line 6
    .line 7
    add-int/lit8 v3, v2, 0x1

    .line 8
    .line 9
    iput v3, p0, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer$d;->a:I

    .line 10
    .line 11
    invoke-static {v1, v2}, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;->e(Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;I)I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    invoke-direct {v0, v1, v2}, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer$b;-><init>(Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;I)V

    .line 16
    .line 17
    .line 18
    return-object v0
.end method

.method public hasNext()Z
    .locals 2

    .line 1
    iget v0, p0, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer$d;->a:I

    .line 2
    .line 3
    iget v1, p0, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer$d;->b:I

    .line 4
    .line 5
    if-gt v0, v1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer$d;->b()Lcom/facebook/react/common/mapbuffer/a$c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public remove()V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string v1, "Operation is not supported for read-only collection"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw v0
.end method
