.class Ls6/e$b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lt6/d$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ls6/e;->e(Lr6/c;Landroid/graphics/Bitmap$Config;)Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/List;

.field final synthetic b:Ls6/e;


# direct methods
.method constructor <init>(Ls6/e;Ljava/util/List;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ls6/e$b;->b:Ls6/e;

    .line 2
    .line 3
    iput-object p2, p0, Ls6/e$b;->a:Ljava/util/List;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(ILandroid/graphics/Bitmap;)V
    .locals 0

    .line 1
    return-void
.end method

.method public b(I)LC5/a;
    .locals 1

    .line 1
    iget-object v0, p0, Ls6/e$b;->a:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, LC5/a;

    .line 8
    .line 9
    invoke-static {p1}, LC5/a;->j(LC5/a;)LC5/a;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method
