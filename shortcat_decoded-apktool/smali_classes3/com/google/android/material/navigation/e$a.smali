.class Lcom/google/android/material/navigation/e$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/material/navigation/e;->onSizeChanged(IIII)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Lcom/google/android/material/navigation/e;


# direct methods
.method constructor <init>(Lcom/google/android/material/navigation/e;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/material/navigation/e$a;->b:Lcom/google/android/material/navigation/e;

    .line 2
    .line 3
    iput p2, p0, Lcom/google/android/material/navigation/e$a;->a:I

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/e$a;->b:Lcom/google/android/material/navigation/e;

    .line 2
    .line 3
    iget v1, p0, Lcom/google/android/material/navigation/e$a;->a:I

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lcom/google/android/material/navigation/e;->A(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
