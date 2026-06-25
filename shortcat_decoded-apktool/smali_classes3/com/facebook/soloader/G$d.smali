.class public final Lcom/facebook/soloader/G$d;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/soloader/G;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1c
    name = "d"
.end annotation


# instance fields
.field private final a:Lcom/facebook/soloader/G$c;

.field private final b:Ljava/io/InputStream;


# direct methods
.method public constructor <init>(Lcom/facebook/soloader/G$c;Ljava/io/InputStream;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/facebook/soloader/G$d;->a:Lcom/facebook/soloader/G$c;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/facebook/soloader/G$d;->b:Ljava/io/InputStream;

    .line 7
    .line 8
    return-void
.end method

.method static synthetic a(Lcom/facebook/soloader/G$d;)Ljava/io/InputStream;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/soloader/G$d;->b:Ljava/io/InputStream;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public available()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/soloader/G$d;->b:Ljava/io/InputStream;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/io/InputStream;->available()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public b()Lcom/facebook/soloader/G$c;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/soloader/G$d;->a:Lcom/facebook/soloader/G$c;

    .line 2
    .line 3
    return-object v0
.end method

.method public close()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/soloader/G$d;->b:Ljava/io/InputStream;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
