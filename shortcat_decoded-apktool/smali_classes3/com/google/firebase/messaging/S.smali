.class public final synthetic Lcom/google/firebase/messaging/S;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Landroid/content/Context;

.field public final synthetic b:Z

.field public final synthetic c:Ln9/j;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;ZLn9/j;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/firebase/messaging/S;->a:Landroid/content/Context;

    .line 5
    .line 6
    iput-boolean p2, p0, Lcom/google/firebase/messaging/S;->b:Z

    .line 7
    .line 8
    iput-object p3, p0, Lcom/google/firebase/messaging/S;->c:Ln9/j;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/firebase/messaging/S;->a:Landroid/content/Context;

    .line 2
    .line 3
    iget-boolean v1, p0, Lcom/google/firebase/messaging/S;->b:Z

    .line 4
    .line 5
    iget-object v2, p0, Lcom/google/firebase/messaging/S;->c:Ln9/j;

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, Lcom/google/firebase/messaging/T;->a(Landroid/content/Context;ZLn9/j;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
