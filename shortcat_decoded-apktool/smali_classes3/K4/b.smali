.class public final LK4/b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LK4/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LK4/b$a;
    }
.end annotation


# instance fields
.field private final a:LK4/d;

.field private final b:LG4/i;


# direct methods
.method public constructor <init>(LK4/d;LG4/i;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LK4/b;->a:LK4/d;

    .line 5
    .line 6
    iput-object p2, p0, LK4/b;->b:LG4/i;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 1
    iget-object v0, p0, LK4/b;->b:LG4/i;

    .line 2
    .line 3
    instance-of v1, v0, LG4/q;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget-object v1, p0, LK4/b;->a:LK4/d;

    .line 8
    .line 9
    check-cast v0, LG4/q;

    .line 10
    .line 11
    invoke-virtual {v0}, LG4/q;->a()Landroid/graphics/drawable/Drawable;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {v1, v0}, LI4/a;->a(Landroid/graphics/drawable/Drawable;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    instance-of v1, v0, LG4/f;

    .line 20
    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    iget-object v1, p0, LK4/b;->a:LK4/d;

    .line 24
    .line 25
    invoke-virtual {v0}, LG4/i;->a()Landroid/graphics/drawable/Drawable;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-interface {v1, v0}, LI4/a;->d(Landroid/graphics/drawable/Drawable;)V

    .line 30
    .line 31
    .line 32
    :cond_1
    return-void
.end method
