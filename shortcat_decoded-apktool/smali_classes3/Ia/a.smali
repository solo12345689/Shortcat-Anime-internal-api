.class public final synthetic LIa/a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:LIa/f;

.field public final synthetic c:Landroid/view/View;

.field public final synthetic d:Landroid/app/Activity;

.field public final synthetic e:Z


# direct methods
.method public synthetic constructor <init>(ZLIa/f;Landroid/view/View;Landroid/app/Activity;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, LIa/a;->a:Z

    .line 5
    .line 6
    iput-object p2, p0, LIa/a;->b:LIa/f;

    .line 7
    .line 8
    iput-object p3, p0, LIa/a;->c:Landroid/view/View;

    .line 9
    .line 10
    iput-object p4, p0, LIa/a;->d:Landroid/app/Activity;

    .line 11
    .line 12
    iput-boolean p5, p0, LIa/a;->e:Z

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget-boolean v0, p0, LIa/a;->a:Z

    .line 2
    .line 3
    iget-object v1, p0, LIa/a;->b:LIa/f;

    .line 4
    .line 5
    iget-object v2, p0, LIa/a;->c:Landroid/view/View;

    .line 6
    .line 7
    iget-object v3, p0, LIa/a;->d:Landroid/app/Activity;

    .line 8
    .line 9
    iget-boolean v4, p0, LIa/a;->e:Z

    .line 10
    .line 11
    invoke-static {v0, v1, v2, v3, v4}, LIa/f;->c(ZLIa/f;Landroid/view/View;Landroid/app/Activity;Z)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
