.class public final LA4/b$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LA4/i$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LA4/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;LG4/m;Lv4/d;)LA4/i;
    .locals 0

    .line 1
    check-cast p1, Landroid/graphics/Bitmap;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3}, LA4/b$a;->b(Landroid/graphics/Bitmap;LG4/m;Lv4/d;)LA4/i;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public b(Landroid/graphics/Bitmap;LG4/m;Lv4/d;)LA4/i;
    .locals 0

    .line 1
    new-instance p3, LA4/b;

    .line 2
    .line 3
    invoke-direct {p3, p1, p2}, LA4/b;-><init>(Landroid/graphics/Bitmap;LG4/m;)V

    .line 4
    .line 5
    .line 6
    return-object p3
.end method
