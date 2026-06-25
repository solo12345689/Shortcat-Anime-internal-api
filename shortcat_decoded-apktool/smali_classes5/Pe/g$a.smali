.class final LPe/g$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LPe/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final a:Lqf/S;

.field private final b:I


# direct methods
.method public constructor <init>(Lqf/S;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LPe/g$a;->a:Lqf/S;

    .line 5
    .line 6
    iput p2, p0, LPe/g$a;->b:I

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .line 1
    iget v0, p0, LPe/g$a;->b:I

    .line 2
    .line 3
    return v0
.end method

.method public final b()Lqf/S;
    .locals 1

    .line 1
    iget-object v0, p0, LPe/g$a;->a:Lqf/S;

    .line 2
    .line 3
    return-object v0
.end method
