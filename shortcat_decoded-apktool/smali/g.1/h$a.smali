.class public final Lg/h$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:Landroid/content/IntentSender;

.field private b:Landroid/content/Intent;

.field private c:I

.field private d:I


# direct methods
.method public constructor <init>(Landroid/app/PendingIntent;)V
    .locals 1

    const-string v0, "pendingIntent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1}, Landroid/app/PendingIntent;->getIntentSender()Landroid/content/IntentSender;

    move-result-object p1

    const-string v0, "pendingIntent.intentSender"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lg/h$a;-><init>(Landroid/content/IntentSender;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/IntentSender;)V
    .locals 1

    const-string v0, "intentSender"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg/h$a;->a:Landroid/content/IntentSender;

    return-void
.end method


# virtual methods
.method public final a()Lg/h;
    .locals 5

    .line 1
    new-instance v0, Lg/h;

    .line 2
    .line 3
    iget-object v1, p0, Lg/h$a;->a:Landroid/content/IntentSender;

    .line 4
    .line 5
    iget-object v2, p0, Lg/h$a;->b:Landroid/content/Intent;

    .line 6
    .line 7
    iget v3, p0, Lg/h$a;->c:I

    .line 8
    .line 9
    iget v4, p0, Lg/h$a;->d:I

    .line 10
    .line 11
    invoke-direct {v0, v1, v2, v3, v4}, Lg/h;-><init>(Landroid/content/IntentSender;Landroid/content/Intent;II)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public final b(Landroid/content/Intent;)Lg/h$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lg/h$a;->b:Landroid/content/Intent;

    .line 2
    .line 3
    return-object p0
.end method

.method public final c(II)Lg/h$a;
    .locals 0

    .line 1
    iput p1, p0, Lg/h$a;->d:I

    .line 2
    .line 3
    iput p2, p0, Lg/h$a;->c:I

    .line 4
    .line 5
    return-object p0
.end method
