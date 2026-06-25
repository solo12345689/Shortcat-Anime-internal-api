.class Li8/b$a;
.super Lj8/a;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li8/b;->c(Ljava/nio/ByteBuffer;IILS4/h;)LU4/v;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/nio/ByteBuffer;

.field final synthetic b:Li8/b;


# direct methods
.method constructor <init>(Li8/b;Ljava/nio/ByteBuffer;)V
    .locals 0

    .line 1
    iput-object p1, p0, Li8/b$a;->b:Li8/b;

    .line 2
    .line 3
    iput-object p2, p0, Li8/b$a;->a:Ljava/nio/ByteBuffer;

    .line 4
    .line 5
    invoke-direct {p0}, Lj8/a;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public b()Ljava/nio/ByteBuffer;
    .locals 2

    .line 1
    iget-object v0, p0, Li8/b$a;->a:Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Li8/b$a;->a:Ljava/nio/ByteBuffer;

    .line 8
    .line 9
    return-object v0
.end method
