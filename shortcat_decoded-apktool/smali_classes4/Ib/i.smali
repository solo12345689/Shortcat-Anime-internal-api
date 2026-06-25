.class public final synthetic LIb/i;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lexpo/modules/image/ExpoImageViewWrapper;

.field public final synthetic b:Z

.field public final synthetic c:LIb/o;

.field public final synthetic d:Landroid/graphics/drawable/Drawable;


# direct methods
.method public synthetic constructor <init>(Lexpo/modules/image/ExpoImageViewWrapper;ZLIb/o;Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LIb/i;->a:Lexpo/modules/image/ExpoImageViewWrapper;

    .line 5
    .line 6
    iput-boolean p2, p0, LIb/i;->b:Z

    .line 7
    .line 8
    iput-object p3, p0, LIb/i;->c:LIb/o;

    .line 9
    .line 10
    iput-object p4, p0, LIb/i;->d:Landroid/graphics/drawable/Drawable;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget-object v0, p0, LIb/i;->a:Lexpo/modules/image/ExpoImageViewWrapper;

    .line 2
    .line 3
    iget-boolean v1, p0, LIb/i;->b:Z

    .line 4
    .line 5
    iget-object v2, p0, LIb/i;->c:LIb/o;

    .line 6
    .line 7
    iget-object v3, p0, LIb/i;->d:Landroid/graphics/drawable/Drawable;

    .line 8
    .line 9
    invoke-static {v0, v1, v2, v3}, Lexpo/modules/image/ExpoImageViewWrapper;->c(Lexpo/modules/image/ExpoImageViewWrapper;ZLIb/o;Landroid/graphics/drawable/Drawable;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
