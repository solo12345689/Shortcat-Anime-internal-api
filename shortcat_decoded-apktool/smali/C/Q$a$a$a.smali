.class public final LC/Q$a$a$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LY/X;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LC/Q$a$a;->invoke(LY/Y;)LY/X;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LC/Q;

.field final synthetic b:Landroid/view/View;


# direct methods
.method public constructor <init>(LC/Q;Landroid/view/View;)V
    .locals 0

    .line 1
    iput-object p1, p0, LC/Q$a$a$a;->a:LC/Q;

    .line 2
    .line 3
    iput-object p2, p0, LC/Q$a$a$a;->b:Landroid/view/View;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public dispose()V
    .locals 2

    .line 1
    iget-object v0, p0, LC/Q$a$a$a;->a:LC/Q;

    .line 2
    .line 3
    iget-object v1, p0, LC/Q$a$a$a;->b:Landroid/view/View;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, LC/Q;->b(Landroid/view/View;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
