.class Lq5/g$o;
.super Lq5/g$P;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lq5/g$n;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq5/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "o"
.end annotation


# instance fields
.field p:Ljava/lang/String;

.field q:Lq5/g$p;

.field r:Lq5/g$p;

.field s:Lq5/g$p;

.field t:Lq5/g$p;

.field u:Landroid/graphics/Matrix;


# direct methods
.method constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lq5/g$P;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public l(Landroid/graphics/Matrix;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lq5/g$o;->u:Landroid/graphics/Matrix;

    .line 2
    .line 3
    return-void
.end method

.method o()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "image"

    .line 2
    .line 3
    return-object v0
.end method
