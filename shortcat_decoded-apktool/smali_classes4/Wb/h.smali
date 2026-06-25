.class public final synthetic LWb/h;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:LWb/i;

.field public final synthetic b:I

.field public final synthetic c:Landroid/content/IntentSender$SendIntentException;


# direct methods
.method public synthetic constructor <init>(LWb/i;ILandroid/content/IntentSender$SendIntentException;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LWb/h;->a:LWb/i;

    .line 5
    .line 6
    iput p2, p0, LWb/h;->b:I

    .line 7
    .line 8
    iput-object p3, p0, LWb/h;->c:Landroid/content/IntentSender$SendIntentException;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, LWb/h;->a:LWb/i;

    .line 2
    .line 3
    iget v1, p0, LWb/h;->b:I

    .line 4
    .line 5
    iget-object v2, p0, LWb/h;->c:Landroid/content/IntentSender$SendIntentException;

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, LWb/i;->b(LWb/i;ILandroid/content/IntentSender$SendIntentException;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
