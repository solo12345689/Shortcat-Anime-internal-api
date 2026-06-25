.class abstract LP2/n$i;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LP2/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x40a
    name = "i"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LP2/n$i$a;
    }
.end annotation


# instance fields
.field public final a:I

.field public final b:Lq2/a0;

.field public final c:I

.field public final d:Lq2/x;


# direct methods
.method public constructor <init>(ILq2/a0;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, LP2/n$i;->a:I

    .line 5
    .line 6
    iput-object p2, p0, LP2/n$i;->b:Lq2/a0;

    .line 7
    .line 8
    iput p3, p0, LP2/n$i;->c:I

    .line 9
    .line 10
    invoke-virtual {p2, p3}, Lq2/a0;->c(I)Lq2/x;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iput-object p1, p0, LP2/n$i;->d:Lq2/x;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public abstract a()I
.end method

.method public abstract b(LP2/n$i;)Z
.end method
