.class public final Lg6/b$b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lt6/d$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg6/b;-><init>(Lb6/b;Lr6/a;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lg6/b;


# direct methods
.method constructor <init>(Lg6/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lg6/b$b;->a:Lg6/b;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(ILandroid/graphics/Bitmap;)V
    .locals 0

    .line 1
    const-string p1, "bitmap"

    .line 2
    .line 3
    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public b(I)LC5/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lg6/b$b;->a:Lg6/b;

    .line 2
    .line 3
    invoke-static {v0}, Lg6/b;->b(Lg6/b;)Lb6/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0, p1}, Lb6/b;->M(I)LC5/a;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method
