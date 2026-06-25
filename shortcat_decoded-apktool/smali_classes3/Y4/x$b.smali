.class public LY4/x$b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LY4/o;
.implements LY4/x$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LY4/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field private final a:Landroid/content/ContentResolver;

.field private final b:Z


# direct methods
.method public constructor <init>(Landroid/content/ContentResolver;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LY4/x$b;->a:Landroid/content/ContentResolver;

    .line 5
    .line 6
    iput-boolean p2, p0, LY4/x$b;->b:Z

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(Landroid/net/Uri;)Lcom/bumptech/glide/load/data/d;
    .locals 3

    .line 1
    new-instance v0, Lcom/bumptech/glide/load/data/i;

    .line 2
    .line 3
    iget-object v1, p0, LY4/x$b;->a:Landroid/content/ContentResolver;

    .line 4
    .line 5
    iget-boolean v2, p0, LY4/x$b;->b:Z

    .line 6
    .line 7
    invoke-direct {v0, v1, p1, v2}, Lcom/bumptech/glide/load/data/i;-><init>(Landroid/content/ContentResolver;Landroid/net/Uri;Z)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public d(LY4/r;)LY4/n;
    .locals 0

    .line 1
    new-instance p1, LY4/x;

    .line 2
    .line 3
    invoke-direct {p1, p0}, LY4/x;-><init>(LY4/x$c;)V

    .line 4
    .line 5
    .line 6
    return-object p1
.end method

.method public teardown()V
    .locals 0

    .line 1
    return-void
.end method
