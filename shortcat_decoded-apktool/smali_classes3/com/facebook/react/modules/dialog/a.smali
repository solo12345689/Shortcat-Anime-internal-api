.class public final Lcom/facebook/react/modules/dialog/a;
.super Landroidx/fragment/app/o;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/modules/dialog/a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0007\u0018\u0000 \u001a2\u00020\u00012\u00020\u0002:\u0001\u001bB\t\u0008\u0016\u00a2\u0006\u0004\u0008\u0003\u0010\u0004B!\u0008\u0011\u0012\u000c\u0010\u0007\u001a\u0008\u0018\u00010\u0005R\u00020\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\u0003\u0010\nJ\u0019\u0010\r\u001a\u00020\u000c2\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0008H\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\u001a\u0010\u0007\u001a\u0008\u0018\u00010\u0005R\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001c"
    }
    d2 = {
        "Lcom/facebook/react/modules/dialog/a;",
        "Landroidx/fragment/app/o;",
        "Landroid/content/DialogInterface$OnClickListener;",
        "<init>",
        "()V",
        "Lcom/facebook/react/modules/dialog/DialogModule$a;",
        "Lcom/facebook/react/modules/dialog/DialogModule;",
        "listener",
        "Landroid/os/Bundle;",
        "arguments",
        "(Lcom/facebook/react/modules/dialog/DialogModule$a;Landroid/os/Bundle;)V",
        "savedInstanceState",
        "Landroid/app/Dialog;",
        "E",
        "(Landroid/os/Bundle;)Landroid/app/Dialog;",
        "Landroid/content/DialogInterface;",
        "dialog",
        "",
        "which",
        "LTd/L;",
        "onClick",
        "(Landroid/content/DialogInterface;I)V",
        "onDismiss",
        "(Landroid/content/DialogInterface;)V",
        "q",
        "Lcom/facebook/react/modules/dialog/DialogModule$a;",
        "r",
        "a",
        "ReactAndroid_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final r:Lcom/facebook/react/modules/dialog/a$a;


# instance fields
.field private final q:Lcom/facebook/react/modules/dialog/DialogModule$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/facebook/react/modules/dialog/a$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/facebook/react/modules/dialog/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/facebook/react/modules/dialog/a;->r:Lcom/facebook/react/modules/dialog/a$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/fragment/app/o;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/facebook/react/modules/dialog/a;->q:Lcom/facebook/react/modules/dialog/DialogModule$a;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/modules/dialog/DialogModule$a;Landroid/os/Bundle;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Landroidx/fragment/app/o;-><init>()V

    .line 4
    iput-object p1, p0, Lcom/facebook/react/modules/dialog/a;->q:Lcom/facebook/react/modules/dialog/DialogModule$a;

    .line 5
    invoke-virtual {p0, p2}, Landroidx/fragment/app/q;->setArguments(Landroid/os/Bundle;)V

    return-void
.end method


# virtual methods
.method public E(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 3

    .line 1
    sget-object p1, Lcom/facebook/react/modules/dialog/a;->r:Lcom/facebook/react/modules/dialog/a$a;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireActivity()Landroidx/fragment/app/v;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "requireActivity(...)"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireArguments()Landroid/os/Bundle;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const-string v2, "requireArguments(...)"

    .line 17
    .line 18
    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, v0, v1, p0}, Lcom/facebook/react/modules/dialog/a$a;->c(Landroid/content/Context;Landroid/os/Bundle;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/Dialog;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    return-object p1
.end method

.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    .line 1
    const-string v0, "dialog"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/react/modules/dialog/a;->q:Lcom/facebook/react/modules/dialog/DialogModule$a;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0, p1, p2}, Lcom/facebook/react/modules/dialog/DialogModule$a;->onClick(Landroid/content/DialogInterface;I)V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public onDismiss(Landroid/content/DialogInterface;)V
    .locals 1

    .line 1
    const-string v0, "dialog"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Landroidx/fragment/app/o;->onDismiss(Landroid/content/DialogInterface;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lcom/facebook/react/modules/dialog/a;->q:Lcom/facebook/react/modules/dialog/DialogModule$a;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Lcom/facebook/react/modules/dialog/DialogModule$a;->onDismiss(Landroid/content/DialogInterface;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method
