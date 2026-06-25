.class public final Landroidx/compose/ui/window/a$b$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LY/X;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/window/a$b;->invoke(LY/Y;)LY/X;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/window/l;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/window/l;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/window/a$b$a;->a:Landroidx/compose/ui/window/l;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public dispose()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/window/a$b$a;->a:Landroidx/compose/ui/window/l;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/compose/ui/window/a$b$a;->a:Landroidx/compose/ui/window/l;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroidx/compose/ui/window/l;->k()V

    .line 9
    .line 10
    .line 11
    return-void
.end method
